package id.co.telkomsigma.webapp.action.minibank;

import java.util.List;

import org.apache.tapestry.IRequestCycle;

import id.co.telkomsigma.service.minibank.TransactionsManager;
import id.co.telkomsigma.webapp.action.BasePage;

public abstract class TransactionsList extends BasePage{
	
	public abstract TransactionsManager getTransactionsManager();
	
	@SuppressWarnings("rawtypes")
	public List getTransactionsList() {
		System.out.println("Start Fetching From Transaction");
		List list = null;
		System.out.println("Transaction Manager = "+this.getTransactionsManager());
		try{
			list = this.getTransactionsManager().actionGetTransaction("All");
		}catch(Exception exception){
			System.out.println("Error Karena = "+exception);
		}
		return  list;
	}
	
	public void edit(IRequestCycle cycle) {
    }
	
}
