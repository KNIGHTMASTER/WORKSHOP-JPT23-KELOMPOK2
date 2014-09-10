package id.co.telkomsigma.dao.minibank;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import id.co.telkomsigma.dao.BaseDaoTestCase;
import id.co.telkomsigma.dao.minibank.CIFDao;
import id.co.telkomsigma.dao.UserDao;
import id.co.telkomsigma.model.minibank.Account;
import id.co.telkomsigma.model.minibank.CIF;
import id.co.telkomsigma.model.minibank.Product;

public class CIFDaoTest extends BaseDaoTestCase{

	private UserDao userDao;
	private CIFDao cifDao; 
	private AccountDao accountDao; 
	private ProductDao productDao;

	
	/**
	 * @return the customerDao
	 */
	public UserDao getCustomerDao() {
		return userDao;
	}


	/**
	 * @return the cifDao
	 */
	public CIFDao getCifDao() {
		return cifDao;
	}


	/**
	 * @return the accountDao
	 */
	public AccountDao getAccountDao() {
		return accountDao;
	}


	/**
	 * @return the productDao
	 */
	public ProductDao getProductDao() {
		return productDao;
	}

	/**
	 * @param customerDao the customerDao to set
	 */
	public void setCustomerDao(UserDao customerDao) {
		this.userDao = customerDao;
	}


	/**
	 * @param cifDao the cifDao to set
	 */
	public void setCifDao(CIFDao cifDao) {
		this.cifDao = cifDao;
	}


	/**
	 * @param accountDao the accountDao to set
	 */
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}


	/**
	 * @param productDao the productDao to set
	 */
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

//
//	public void testActionGetCIFById(){
//		Customer customer = new Customer();	
//		CIF cif = new CIF();
//		cif.setNumber("001");
//		cif.setFoundSource("Dari Kantor");
//		Account account = new Account();	
//		Set<Account> accounts = new HashSet<Account>();
//		Product product = new Product();
//				
//		customer.setAddress("jakarta");
//		customer.setGender(true);
//		customer.setKtpNumber("123");
//		customer.setName("Fauzi");
//		customer.setCif(cif);	
//		this.getCustomerDao().actionSaveCustomer(customer);
//		
//		product.setName("Kredit");
//		product.setPrice(Double.valueOf("200000"));
//		product.setRemark("pinjam dulu baru bayar");
//		product.setProductEnable(true);
//		this.getProductDao().actionSaveProduct(product);
//		
//		account.setNumber("111111");
//		account.setBalance(Double.valueOf("1000000.0"));
//		account.setAccount_enable(true);
//		account.setProduct(product);
//		this.getAccountDao().actionSaveAccount(account);
//		accounts.add(account);
//		
//		cif.setNumber("8888");
//		cif.setFoundSource("ok");
//		cif.setUser(customer);
//		cif.setAccounts(accounts);
//		
//		this.getCifDao().actionSave(cif);
//		CIF cifRetrieved = (CIF) this.getCifDao().actionGetCIF(cif.getId());
//		assertNotNull(cifRetrieved);
//		System.out.println("CIF INFORMATION = "+cifRetrieved);
//		for(Account account2:cif.getAccounts()){
//			System.out.println(account2.toString());
//		}
//	}
//
//	public void testActionSave(){
//		Customer customer = new Customer();	
//		CIF cif = new CIF();
//		cif.setNumber("001");
//		cif.setFoundSource("Dari Kantor");
//		Account account = new Account();	
//		Set<Account> accounts = new HashSet<Account>();
//		Product product = new Product();
//				
//		customer.setAddress("jakarta");
//		customer.setGender(true);
//		customer.setKtpNumber("123");
//		customer.setName("Fauzi");
//		customer.setCif(cif);	
//		this.getCustomerDao().actionSaveCustomer(customer);
//		
//		product.setName("Kredit");
//		product.setPrice(Double.valueOf("200000"));
//		product.setRemark("pinjam dulu baru bayar");
//		product.setProductEnable(true);
//		this.getProductDao().actionSaveProduct(product);
//		
//		account.setNumber("111111");
//		account.setBalance(Double.valueOf("1000000.0"));
//		account.setAccount_enable(true);
//		account.setProduct(product);
//		this.getAccountDao().actionSaveAccount(account);
//		accounts.add(account);
//		
//		cif.setNumber("8888");
//		cif.setFoundSource("ok");
//		cif.setUser(customer);
//		cif.setAccounts(accounts);
//		
//		this.getCifDao().actionSave(cif);
//		Long saveId = cif.getId();
//		assertNotNull(saveId);
//	}
//	
//	public void testGetAllCifs(){
//		Customer customer = new Customer();	
//		CIF cif = new CIF();
//		cif.setNumber("001");
//		cif.setFoundSource("Dari Kantor");
//		Account account = new Account();	
//		Set<Account> accounts = new HashSet<Account>();
//		Product product = new Product();
//				
//		customer.setAddress("jakarta");
//		customer.setGender(true);
//		customer.setKtpNumber("123");
//		customer.setName("Fauzi");
//		customer.setCif(cif);	
//		this.getCustomerDao().actionSaveCustomer(customer);
//		
//		product.setName("Kredit");
//		product.setPrice(Double.valueOf("200000"));
//		product.setRemark("pinjam dulu baru bayar");
//		product.setProductEnable(true);
//		this.getProductDao().actionSaveProduct(product);
//		
//		account.setNumber("111111");
//		account.setBalance(Double.valueOf("1000000.0"));
//		account.setAccount_enable(true);
//		account.setProduct(product);
//		this.getAccountDao().actionSaveAccount(account);
//		accounts.add(account);
//		
//		cif.setNumber("8888");
//		cif.setFoundSource("ok");
//		cif.setUser(customer);
//		cif.setAccounts(accounts);
//		
//		this.getCifDao().actionSave(cif);
//		List<CIF> cifs = this.getCifDao().actionGetCIFAll();
//		for(CIF cif2:cifs){
//			System.out.println("CIF LIST = "+cif2.toString());
//		}
//	}
}
