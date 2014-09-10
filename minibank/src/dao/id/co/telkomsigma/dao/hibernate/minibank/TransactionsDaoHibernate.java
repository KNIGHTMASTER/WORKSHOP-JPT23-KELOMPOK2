package id.co.telkomsigma.dao.hibernate.minibank;

import java.util.Date;
import java.util.List;

import id.co.telkomsigma.dao.hibernate.BaseDaoHibernate;
import id.co.telkomsigma.dao.minibank.TransactionsDao;
import id.co.telkomsigma.model.minibank.Account;
import id.co.telkomsigma.model.minibank.Transactions;

public class TransactionsDaoHibernate extends BaseDaoHibernate implements TransactionsDao{

	/* (non-Javadoc)
	 * @see id.co.telkomsigma.dao.minibank.TransactionDao#actionGetAllTransaction()
	 */
	@Override
	public List<Transactions> actionGetAllTransaction() {
		return getHibernateTemplate().loadAll(Transactions.class);
	}

	/* (non-Javadoc)
	 * @see id.co.telkomsigma.dao.minibank.TransactionDao#actionGetTransactionByAccountSource(id.co.telkomsigma.model.minibank.Account)
	 */
	@Override
	public List<Transactions> actionGetTransactionByAccountSource(Account account) {
		List<Transactions> transactionAccounts = getHibernateTemplate().find("from Transaction where fk_accountsource_id = ?", account);
		if(transactionAccounts!=null && !transactionAccounts.isEmpty())
			return transactionAccounts;
		return null;
	}

	/* (non-Javadoc)
	 * @see id.co.telkomsigma.dao.minibank.TransactionDao#actionGetTransactionByDate(java.util.Date)
	 */
	@Override
	public List<Transactions> actionGetTransactionByDate(Date date) {
		List<Transactions> transactionDates = getHibernateTemplate().find("from Transaction where date >= ?", date);
		if(transactionDates!=null && !transactionDates.isEmpty())
			return transactionDates;
		return null;
	}
	
}
