package id.co.telkomsigma.webapp.action.minibank;

import java.io.IOException;

import org.apache.tapestry.IRequestCycle;
import org.apache.tapestry.engine.ILink;
import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;

import id.co.telkomsigma.model.minibank.Product;
import id.co.telkomsigma.model.minibank.Test;
import id.co.telkomsigma.service.UserExistsException;
import id.co.telkomsigma.service.minibank.ProductManager;
import id.co.telkomsigma.service.minibank.TestManager;
import id.co.telkomsigma.webapp.action.BasePage;

public abstract class TestForm extends BasePage implements PageBeginRenderListener {

    public abstract TestManager getTestManager();
    public abstract void setTest(Test test);
    public abstract Test getTest();
        
	public void pageBeginRender(PageEvent event) {
    	if (getTest() == null && !event.getRequestCycle().isRewinding()) {
            setTest(new Test());
        } else if (event.getRequestCycle().isRewinding()) {
            setTest(new Test());
        }
    }
    
    public ILink cancel(IRequestCycle cycle) throws IOException {
        if (log.isDebugEnabled()) {
            log.debug("entered cancel method");
        }
    	return getEngineService().getLink(false, "testLink");
    }
    
    public void save(IRequestCycle cycle) throws UserExistsException, IOException {
        if (log.isDebugEnabled()) {
            log.debug("Entering save method");
        }
        
        getSession().setAttribute("message", getText("user.registered"));
        getResponse().sendRedirect(getRequest().getContextPath());

//    	ProductList nextPage = (ProductList) cycle.getPage("testList");
//    	Product product = getProduct();
//        try{
//            this.getProductManager().actionSaveProduct(product);
//            nextPage.setMessage(getText("tes.save", product.getName()));
//            return getEngineService().getLink(false, nextPage.getPageName());
//    	} catch (Exception e) {
//            nextPage.setMessage(getText("tes.error", product.getName()));
//            return getEngineService().getLink(false, nextPage.getPageName());
//        }      
    }
    
    
    
    
}
