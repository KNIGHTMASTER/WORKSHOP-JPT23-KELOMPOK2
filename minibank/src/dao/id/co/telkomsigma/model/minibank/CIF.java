package id.co.telkomsigma.model.minibank;

import id.co.telkomsigma.model.BaseObject;
import id.co.telkomsigma.model.User;

import java.io.Serializable;
import java.util.Set;

/**
 * 
 * @hibernate.class table="cif"
 */
public class CIF extends BaseObject implements Serializable {
	
	private static final long serialVersionUID = 8541522225904117285L;
	
	private Long id;
	
	private String number;
	
	private String foundSource;
	
	private User user;
	
	private Set<Account> accounts;
	//for One Account To Many CIFs

	/**
	 * @hibernate.id column="id" generator-class="native" unsaved-value="null"
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @hibernate.property length="20" not-null="true" unique="true"
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @hibernate.property length="1000" not-null="true" unique="false"
	 */
	public String getFoundSource() {
		return foundSource;
	}

	/**
	 * @hibernate.many-to-one class="id.co.telkomsigma.model.User" cascade="all" column="fk_user_id"
	 * @return
	 */
	public User getUser() {
		return user;
	}
	
	/**
	 * @hibernate.one-to-many class="id.co.telkomsigma.model.minibank.Account"
	 */
	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setFoundSource(String foundSource) {
		this.foundSource = foundSource;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((foundSource == null) ? 0 : foundSource.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		CIF other = (CIF) obj;
		if (foundSource == null) {
			if (other.foundSource != null)
				return false;
		} else if (!foundSource.equals(other.foundSource))
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
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CIF [id=" + id + ", number=" + number + ", foundSource="
				+ foundSource + ", user=" + user + "]";
	}
	
}
