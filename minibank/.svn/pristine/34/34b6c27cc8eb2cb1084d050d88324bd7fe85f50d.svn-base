package id.co.telkomsigma.model.minibank;

import id.co.telkomsigma.model.BaseObject;

import java.io.Serializable;
import java.util.Date;

/**
 * @hibernate.class table="transactions"
 */
public class Transactions extends BaseObject implements Serializable{

	private static final long serialVersionUID = -6027642329351437727L;
	
	private Long id;
	
	private Date date;
	
	private boolean status;	
		
	private double amount;	
	
	private String transactionType;
	
	private Account accountSource;
	
	private Account accountDestination;

	/**
	 * @hibernate.id column="id" generator-class="native" unsaved-value="null"
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @hibernate.many-to-one class="id.co.telkomsigma.model.minibank.Account" cascade="all"
	 * @return
	 */
	public Account getAccountSource() {
		return accountSource;
	}

	/**
	 * @hibernate.many-to-one class="id.co.telkomsigma.model.minibank.Account" cascade="all" column="fk_accountdestination_id"
	 * @return
	 */
	public Account getAccountDestination() {
		return accountDestination;
	}

	/**
	 * @hibernate.property not-null="false" unique="false"
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @hibernate.property not-null="false" 
	 */
	public boolean getStatus() {
		return status;
	}

	/**
	 * @hibernate.property not-null="false" length="100"
	 */
	public double getAmount() {
		return amount;
	}
		
	/**
	 * @hibernate.property not-null="false" length="100"
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setAccountSource(Account accountSource) {
		this.accountSource = accountSource;
	}

	/**
	 * @param accountDestination the accountDestination to set
	 */
	public void setAccountDestination(Account accountDestination) {
		this.accountDestination = accountDestination;
	}	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (status ? 1231 : 1237);
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
		Transactions other = (Transactions) obj;
		if (Double.doubleToLongBits(amount) != Double
				.doubleToLongBits(other.amount))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", date=" + date + ", status="
				+ status + ", accountSource=" + accountSource
				+ ", accountDestination=" + accountDestination + ", amount="
				+ amount + "]";
	}
}