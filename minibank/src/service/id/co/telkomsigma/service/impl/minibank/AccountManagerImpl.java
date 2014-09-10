package id.co.telkomsigma.service.impl.minibank;

import java.util.List;

import id.co.telkomsigma.dao.minibank.AccountDao;
import id.co.telkomsigma.dao.minibank.CIFDao;
import id.co.telkomsigma.model.minibank.Account;
import id.co.telkomsigma.model.minibank.CIF;
import id.co.telkomsigma.service.impl.BaseManager;
import id.co.telkomsigma.service.minibank.AccountManager;
import id.co.telkomsigma.service.minibank.CIFManager;


public class AccountManagerImpl extends BaseManager implements AccountManager {
	
	private AccountDao accountDao;
	//jdvhad

	/**
	 * @return the accountDao
	 */
	public AccountDao getAccountDao() {
		return accountDao;
	}

	/**
	 * @param accountDao the accountDao to set
	 */
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public List actionGetAll() {
		return this.getAccountDao().actionGetAllAccount();
	}

	/* (non-Javadoc)
	 * @see id.co.telkomsigma.service.minibank.AccountManager#actionGetAccount(java.lang.Long)
	 */
	@Override
	public Account actionGetAccount(Long accountId) {
		return this.accountDao.actionGetAccount(accountId);
	}

	/* (non-Javadoc)
	 * @see id.co.telkomsigma.service.minibank.AccountManager#actionLoadAccountByNumber(java.lang.String)
	 */
	@Override
	public Account actionLoadAccountByNumber(String accountNumber) {
		return this.actionLoadAccountByNumber(accountNumber);
	}

	/* (non-Javadoc)
	 * @see id.co.telkomsigma.service.minibank.AccountManager#actionSaveAccount(id.co.telkomsigma.model.minibank.Account)
	 */
	@Override
	public void actionSaveAccount(Account account) {
		this.accountDao.actionSaveAccount(account);
	}

	/* (non-Javadoc)
	 * @see id.co.telkomsigma.service.minibank.AccountManager#actionGetAllAccountByCif(java.lang.Long)
	 */
	@Override
	public List<Account> actionGetAllAccountByCif(CIF cif) {
		return this.accountDao.actionGetAllAccountByCif(cif);
	}	
}
