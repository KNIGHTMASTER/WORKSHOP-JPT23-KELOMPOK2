package id.co.telkomsigma.webapp.action.minibank;

import java.io.IOException;

import org.apache.tapestry.IRequestCycle;
import org.apache.tapestry.engine.ILink;
import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;

import id.co.telkomsigma.model.User;
import id.co.telkomsigma.model.minibank.CIF;
import id.co.telkomsigma.model.User;
import id.co.telkomsigma.service.UserExistsException;
import id.co.telkomsigma.service.UserManager;
import id.co.telkomsigma.service.minibank.AccountManager;
import id.co.telkomsigma.service.minibank.CIFManager;
import id.co.telkomsigma.service.UserManager;
import id.co.telkomsigma.webapp.action.BasePage;
import id.co.telkomsigma.webapp.action.UserList;

public abstract class CIFForm extends BasePage implements PageBeginRenderListener {

    public abstract CIFManager getCIFManager();
    
    public abstract UserManager getUserManager();  
    
    public abstract void setCIF(CIF cifS);
    
    public abstract CIF getCIF();
    
    private User user;   
        
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	public void pageBeginRender(PageEvent event) {
    	if (getCIF() == null && !event.getRequestCycle().isRewinding()) {
    		setCIF(new CIF());
        } else if (event.getRequestCycle().isRewinding()) {
            setCIF(new CIF());
        }
    }
    
    public ILink cancel(IRequestCycle cycle) throws IOException {
        if (log.isDebugEnabled()) {
            log.debug("entered cancel method");
        }
    	return getEngineService().getLink(false, "userList");
    }
    
    public ILink save(IRequestCycle cycle) throws UserExistsException, IOException {
        if (log.isDebugEnabled()) {
            log.debug("Entering save method");
        }
    	CIFList nextPage = (CIFList) cycle.getPage("cifList");
        try{
        	CIF cif = getCIF();
        	getUser().setCif(getCIF());
        	cif.setUser(getUser());
        	System.out.println(cif.toString());
        	
        	try{
        		this.getUserManager().saveUser(getUser());	
        	}catch(Exception exception){
        		System.out.println("Error Saving User + CIF karena "+exception);
        	}
        	
            nextPage.setMessage(getText("cif.save", getUser().getFullName()));
            return getEngineService().getLink(false, nextPage.getPageName());
    	} catch (Exception e) {
    		System.out.println("Error Processing Save = "+e);
            nextPage.setMessage(getText("cif.error", getCIF().getNumber()));
            return getEngineService().getLink(false, nextPage.getPageName());
        }      
    }
}
