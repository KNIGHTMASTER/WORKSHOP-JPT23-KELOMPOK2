package id.co.telkomsigma.webapp.action.minibank;

import java.util.List;

import org.apache.tapestry.IRequestCycle;


import id.co.telkomsigma.model.minibank.Product;
import id.co.telkomsigma.service.minibank.ProductManager;
import id.co.telkomsigma.webapp.action.BasePage;

public abstract class ProductList extends BasePage{
	
	public abstract ProductManager getProductManager();
	
	@SuppressWarnings("rawtypes")
	public List getProductList() {
		
		return getProductManager().getAllProduct();
	}
	
	public void edit(IRequestCycle cycle) {
    	ProductForm nextPage = (ProductForm)cycle.getPage("productForm");
    	Object[] parameters = cycle.getListenerParameters();
    	Long id = (Long)parameters[0];
    	
    	if(log.isDebugEnabled()){
    		log.debug("fetching Product with id : "+id);
    	}
    	
    	Product productRetrieved = getProductManager().actionGetProduct(id);  	
    	nextPage.setProduct(productRetrieved);
    	cycle.activate(nextPage);
    }
	
}
