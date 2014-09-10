package id.co.telkomsigma.webapp.action.minibank;

import java.io.IOException;
import java.util.List;

import org.apache.tapestry.IRequestCycle;
import org.apache.tapestry.engine.ILink;

import id.co.telkomsigma.model.minibank.Account;
import id.co.telkomsigma.model.minibank.CIF;
import id.co.telkomsigma.service.UserExistsException;
import id.co.telkomsigma.service.minibank.AccountManager;
import id.co.telkomsigma.service.minibank.CIFManager;
import id.co.telkomsigma.service.UserManager;
import id.co.telkomsigma.webapp.action.BasePage;

public abstract class CIFList extends BasePage{
	
	public abstract CIFManager getCifManager();
	
	public abstract UserManager getUserManager();
	
	public abstract AccountManager getAccountManager();
	
	/*	public abstract void setAccount(Account account);*/
	
	@SuppressWarnings("rawtypes")	
	public List getCifList() {
		System.out.println("Start Fetching Data From CIF List !");
		List<CIF> list = null;
		try{
			list = this.getCifManager().actionLoadCIFALL();
			System.out.println("CIF + ACC = "+list.get(0).toString());
		}catch(Exception listE){
			System.out.println("Error Karena = "+listE);
		}
		return list;
	}
	
	public void edit(IRequestCycle cycle) {
    	CIFForm nextPage = (CIFForm)cycle.getPage("cifForm");
    	Object[] parameters = cycle.getListenerParameters();
    	Long id = (Long)parameters[0];
    	
    	if(log.isDebugEnabled()){
    		log.debug("fetching CIF with id : "+id);
    	}
    	
    	CIF cifRetrieved = getCifManager().actionGetCIF(id);  	
    	nextPage.setCIF(cifRetrieved);
    	cycle.activate(nextPage);
    }
	
	public ILink addAccount(IRequestCycle cycle) throws UserExistsException, IOException{		
    	Object[] parameters = cycle.getListenerParameters();
    	Long id = (Long)parameters[0];
    	
    	if(log.isDebugEnabled()){
    		log.debug("fetching CIF for Add Account with id : "+id);
    	}
    	    	    	
    	String informasi = "Account Data For CIF "+id; 
    	Account account=  new Account();  	    	
    	
        try{        	        	 
        	AccountForm nextPage = (AccountForm)cycle.getPage("accountForm");
        	nextPage.setId(String.valueOf(id));
            return getEngineService().getLink(false, nextPage.getPageName());
    	} catch (Exception e) {
    		System.out.println("Entering Exception Page!");
    		System.out.println("Error Occured"+e);
    		return getEngineService().getLink(false, "accountForm");
        }    	
    }	
	
}
