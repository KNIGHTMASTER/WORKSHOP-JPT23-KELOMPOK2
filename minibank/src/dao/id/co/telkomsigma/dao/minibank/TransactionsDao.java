package id.co.telkomsigma.dao.minibank;

import java.util.Date;
import java.util.List;

import id.co.telkomsigma.model.minibank.Account;
import id.co.telkomsigma.model.minibank.Transactions;

public interface TransactionsDao {
	
	public List<Transactions> actionGetAllTransaction();
	
	public List<Transactions> actionGetTransactionByAccountSource(Account account);
	
	public List<Transactions> actionGetTransactionByDate(Date date);
}
