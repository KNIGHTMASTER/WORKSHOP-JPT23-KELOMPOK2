package id.co.telkomsigma.model.minibank;

import id.co.telkomsigma.model.BaseObject;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


/**
 * @hibernate.class table="account"
 */
public class Account extends BaseObject implements Serializable{

	private static final long serialVersionUID = -1620363631940110162L;

	private Long id;
	private String number;
	private Double balance;
	private Boolean account_enable;
	

	private Product product;

	private Set<Transactions> transactionsources = new HashSet<Transactions>();
	private Transactions transactiondestination = new Transactions();

	private CIF cif;
	
	
	public Account(){
		
	}
	
	public Account(String number, Double balance, Boolean account_enable){
		this.number=number;
		this.balance=balance;
		this.account_enable=account_enable;
	}

	/**
	 * @hibernate.id column="id" generator-class="native" unsaved-value="null"
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @hibernate.property not-null="true" length="20" unique="true"
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @hibernate.property not-null="true"
	 */
	public Double getBalance() {
		return balance;
	}

	/**
	 * @hibernate.many-to-one class="id.co.telkomsigma.model.minibank.CIF" cascade="all" column="fk_cif_id" 
	 * @return
	 */
	public CIF getCif() {
		return cif;
	}

	/**
	 * @hibernate.many-to-one class="id.co.telkomsigma.model.minibank.Product" cascade="all" column="fk_product_id"
	 * @return
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @hibernate.property
	 */
	public Boolean getAccount_enable() {
		return account_enable;
	}


	/**
	 * @param account_enable the account_enable to set
	 */
	public void setAccount_enable(Boolean account_enable) {
		this.account_enable = account_enable;
	}

	/**
	 * @hibernate.set cascade="all" lazy="false"
	 * @hibernate.key column="fk_accountsource_id"
	 * @hibernate.one-to-many class="id.co.telkomsigma.model.minibank.Transactions"
	 */
	public Set<Transactions> getTransactionsources() {
		return transactionsources;
	}

	/**
	 * @hibernate.one-to-one class="id.co.telkomsigma.model.minibank.Transactions" cascade="all"
	 * @return
	 */
	public Transactions getTransactiondestination() {
		return transactiondestination;
	}

	/**
	 * @param transactionsources the transactionsources to set
	 */
	public void setTransactionsources(Set<Transactions> transactionsources) {
		this.transactionsources = transactionsources;
	}

	/**
	 * @param transactiondestinations the transactiondestinations to set
	 */
	public void setTransactiondestination(Transactions transactiondestination) {
		this.transactiondestination = transactiondestination;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void setCif(CIF cif) {
		this.cif = cif;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((account_enable == null) ? 0 : account_enable.hashCode());
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (account_enable == null) {
			if (other.account_enable != null)
				return false;
		} else if (!account_enable.equals(other.account_enable))
			return false;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [id=" + id + ", number=" + number + ", balance="
				+ balance + ", account_enable=" + account_enable + "]";
	}

	
	
}
