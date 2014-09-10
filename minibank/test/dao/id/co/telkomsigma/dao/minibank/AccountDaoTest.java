package id.co.telkomsigma.dao.minibank;

import java.util.ArrayList;
import java.util.List;

import id.co.telkomsigma.dao.BaseDaoTestCase;
import id.co.telkomsigma.dao.minibank.AccountDao;
import id.co.telkomsigma.model.minibank.Account;

public class AccountDaoTest extends BaseDaoTestCase{

	private AccountDao accountDao;

	/**
	 * @return the accountDao
	 */
	public AccountDao getAccountDao() {
		return accountDao;
	}

	/**
	 * @param customerDao the accountDao to set
	 */
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void testActionGetAll(){
		List<Account> foundAccounts = new ArrayList<Account>(); 
		Account account1 = new Account("12345", 5000.00, true);
		this.getAccountDao().actionSaveAccount(account1);
		Account account2 = new Account("67890", 5000.00, true);
		this.getAccountDao().actionSaveAccount(account2);
		
		foundAccounts = this.getAccountDao().actionGetAllAccount();
		assertNotNull(foundAccounts);
		for (Account account : foundAccounts) {
			System.out.println(account.toString());
		}		
	}
	
	public void testActionGetAccount(){
		Account account = new Account("54321", 5000.00, true);
		this.getAccountDao().actionSaveAccount(account);
		Long saveId = account.getId();
		assertNotNull(saveId);
		Account foundAccount = this.getAccountDao().actionGetAccount(saveId);
		assertNotNull(foundAccount);
		System.out.println(foundAccount);
	}
	
	public void testActionSaveAccount(){
		Account account = new Account("32145", 5000.00, true);
		this.getAccountDao().actionSaveAccount(account);
		Long saveId = account.getId();
		assertNotNull(saveId);
		Account foundAccount = this.getAccountDao().actionGetAccount(saveId);
		assertNotNull(foundAccount);
		System.out.println(foundAccount);
	}		
	
}
