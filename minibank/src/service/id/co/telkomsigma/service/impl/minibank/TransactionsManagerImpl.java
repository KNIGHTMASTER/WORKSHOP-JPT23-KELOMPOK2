package id.co.telkomsigma.service.impl.minibank;

import id.co.telkomsigma.dao.minibank.TransactionsDao;
import id.co.telkomsigma.model.minibank.Account;
import id.co.telkomsigma.model.minibank.Transactions;
import id.co.telkomsigma.service.impl.BaseManager;
import id.co.telkomsigma.service.minibank.TransactionsManager;

import java.util.Date;
import java.util.List;


public class TransactionsManagerImpl extends BaseManager implements TransactionsManager {
	
	private TransactionsDao transactionsDao;	
	
	/**
	 * @return the transactionsDao
	 */
	public TransactionsDao getTransactionsDao() {
		return transactionsDao;
	}

	/**
	 * @param transactionsDao the transactionsDao to set
	 */
	public void setTransactionsDao(TransactionsDao transactionsDao) {
		this.transactionsDao = transactionsDao;
	}


	/* (non-Javadoc)
	 * @see id.co.telkomsigma.service.minibank.TransactionManager#actionGetTransaction(java.lang.Object)
	 */
	@Override
	public List<Transactions> actionGetTransaction(Object obj) {
		if(obj.equals(Account.class))
			return this.transactionsDao.actionGetTransactionByAccountSource((Account)obj);
		else if(obj.equals(Date.class))
			return this.transactionsDao.actionGetTransactionByDate((Date)obj);
		else
			return this.transactionsDao.actionGetAllTransaction();
	}	
}
