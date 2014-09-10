package id.co.telkomsigma.service.minibank;

import java.util.List;

import id.co.telkomsigma.model.minibank.Account;
import id.co.telkomsigma.model.minibank.CIF;

public interface AccountManager {
	
	public List actionGetAll();

	public Account actionGetAccount(Long accountId);

	public Account actionLoadAccountByNumber(String accountNumber);

	public void actionSaveAccount(Account account);
	
	public List<Account> actionGetAllAccountByCif(CIF cif);
	
}
