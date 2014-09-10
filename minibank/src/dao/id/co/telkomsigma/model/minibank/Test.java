package id.co.telkomsigma.model.minibank;

import java.io.Serializable;

import id.co.telkomsigma.model.BaseObject;

/**
 * @hibernate.class table="test"
 */
public class Test extends BaseObject implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;

	/**
	 * @hibernate.id column="id" generator-class="native" unsaved-value="null"
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @hibernate.property not-null="true" length="20" unique="true"
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (!(obj instanceof Test))
			return false;
		Test other = (Test) obj;
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
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + "]";
	}
	
	
}
