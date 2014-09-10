package id.co.telkomsigma.webapp.action.minibank;

import java.io.IOException;

import id.co.telkomsigma.model.minibank.Transactions;
import id.co.telkomsigma.service.UserExistsException;
import id.co.telkomsigma.service.minibank.AccountManager;
import id.co.telkomsigma.service.minibank.TransactionsManager;
import id.co.telkomsigma.webapp.action.BasePage;

import org.apache.tapestry.IRequestCycle;
import org.apache.tapestry.engine.ILink;
import org.apache.tapestry.event.PageBeginRenderListener;
import org.apache.tapestry.event.PageEvent;

public abstract class TransactionsDepositForm extends BasePage implements PageBeginRenderListener{

	public abstract TransactionsManager getTransactionsManager();
	
	public abstract void setTransactions(Transactions transactions);
	
	public abstract AccountManager getAccountManager();
	
	public abstract Transactions getTransactions();
	
	public void pageBeginRender(PageEvent event){
		if (getTransactions() == null && !event.getRequestCycle().isRewinding()) {
            setTransactions(new Transactions());
        } else if (event.getRequestCycle().isRewinding()) {
            setTransactions(new Transactions());
        }
	}
	
    public ILink cancel(IRequestCycle cycle) throws IOException {
        if (log.isDebugEnabled()) {
            log.debug("Entering cancel Transaction method");
        }
    	return getEngineService().getLink(false, "transactionsList");
    }
    public ILink save(IRequestCycle cycle) throws UserExistsException, IOException {
        if (log.isDebugEnabled()) {
            log.debug("Entering save Deposit Transaction amethod");
        }

    	TransactionsList nextPage = (TransactionsList) cycle.getPage("transactionsList");
    	Transactions transactions= getTransactions();
/*        try{
            this.getTransactionsManager().actionGetTransaction(obj)
            nextPage.setMessage(getText("product.save", product.getName()));
            return getEngineService().getLink(false, nextPage.getPageName());
    	} catch (Exception e) {
            nextPage.setMessage(getText("product.error", product.getName()));
        	return getEngineService().getLink(false, nextPage.getPageName());    
        }*/    
        return getEngineService().getLink(false, nextPage.getPageName());   
   }    
    
}
