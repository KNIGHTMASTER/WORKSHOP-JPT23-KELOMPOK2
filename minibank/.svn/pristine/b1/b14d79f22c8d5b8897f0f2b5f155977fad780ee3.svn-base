package id.co.telkomsigma.model.minibank;

import id.co.telkomsigma.model.BaseObject;

import java.io.Serializable;

/**
 *  @hibernate.class table="product"
 */
public class Product extends BaseObject implements Serializable {

	private static final long serialVersionUID = 5247057795082583954L;

	private Long id;
	
	private String name;
	
	private Double price;
	
	private String remark;
	
	private boolean productEnable;
	
	private Account account;


	/**
	 * @hibernate.id column="id" generator-class="native" unsaved-value="null"
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @hibernate.property length="50" not-null="true" unique="false"
	 */
	public String getName() {
		return name;
	}

	/**
	 * @hibernate.property length="50" not-null="true" unique="false"
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 *@hibernate.property length="500" not-null="true" unique="false"
	 */
	public String getRemark() {
		return remark;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public void setPrice(Double price) {
		this.price = price;
	}

	
	public void setRemark(String remark) {
		this.remark = remark;
	}

	
	
	/**
	 * @hibernate.one-to-one class="id.co.telkomsigma.model.minibank.Account" cascade="all"
	 */
	public Account getAccount() {
		return account;
	}

	
	public void setAccount(Account account) {
		this.account = account;
	}

	

	/**
	 * @hibernate.property not-null="false"
	 */
	public boolean isProductEnable() {
		return productEnable;
	}

	/**
	 * @param productEnable the productEnable to set
	 */
	public void setProductEnable(boolean productEnable) {
		this.productEnable = productEnable;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + (productEnable ? 1231 : 1237);
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
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
		Product other = (Product) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (productEnable != other.productEnable)
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ ", remark=" + remark + ", productEnable=" + productEnable
				+ ", account=" + account + "]";
	}

	
	
}
