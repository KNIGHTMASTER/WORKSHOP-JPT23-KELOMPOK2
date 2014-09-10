package id.co.telkomsigma.webapp.action.minibank;

import java.io.IOException;

import org.apache.tapestry.IRequestCycle;
import org.apache.tapestry.engine.ILink;
import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;

import id.co.telkomsigma.model.minibank.Product;
import id.co.telkomsigma.service.UserExistsException;
import id.co.telkomsigma.service.minibank.ProductManager;
import id.co.telkomsigma.webapp.action.BasePage;

public abstract class ProductForm extends BasePage implements PageBeginRenderListener {

    public abstract ProductManager getProductManager();
    public abstract void setProduct(Product product);
    public abstract Product getProduct();
        
	public void pageBeginRender(PageEvent event) {
    	if (getProduct() == null && !event.getRequestCycle().isRewinding()) {
            setProduct(new Product());
        } else if (event.getRequestCycle().isRewinding()) {
            setProduct(new Product());
        }
    }
    
    public ILink cancel(IRequestCycle cycle) throws IOException {
        if (log.isDebugEnabled()) {
            log.debug("entered cancel method");
        }
    	return getEngineService().getLink(false, "productList");
    }
    
    public ILink save(IRequestCycle cycle) throws UserExistsException, IOException {
        if (log.isDebugEnabled()) {
            log.debug("Entering save method");
        }

    	ProductList nextPage = (ProductList) cycle.getPage("productList");
    	Product product = getProduct();
        try{
            this.getProductManager().actionSaveProduct(product);
            nextPage.setMessage(getText("product.save", product.getName()));
            return getEngineService().getLink(false, nextPage.getPageName());
    	} catch (Exception e) {
            nextPage.setMessage(getText("product.error", product.getName()));
            return getEngineService().getLink(false, nextPage.getPageName());
        }      
    }
}
