package id.co.telkomsigma.dao.hibernate.minibank;

import java.util.List;

import id.co.telkomsigma.dao.hibernate.BaseDaoHibernate;
import id.co.telkomsigma.dao.minibank.ProductDao;
import id.co.telkomsigma.model.minibank.Product;

public class ProductDaoHibernate extends BaseDaoHibernate implements ProductDao {

	/* (non-Javadoc)
	 * @see id.co.telkomsigma.dao.minibank.ProductDao#actionGetProduct(java.lang.Long)
	 */
	@Override
	public Product actionGetProduct(Long productId) {
		
		return (Product)getHibernateTemplate().get(Product.class, productId);
	}

	/* (non-Javadoc)
	 * @see id.co.telkomsigma.dao.minibank.ProductDao#loadProductByName(java.lang.String)
	 */
	@Override
	public Product loadProductByName(String productName) {
		
		List<Product> product = getHibernateTemplate().find("from Product where name=?", productName);
		
		if(product!=null && !product.isEmpty()){
			return product.get(0);
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see id.co.telkomsigma.dao.minibank.ProductDao#getAllProduct()
	 */
	@Override
	public List<Product> getAllProduct() {
		return getHibernateTemplate().loadAll(Product.class);
	}

	/* (non-Javadoc)
	 * @see id.co.telkomsigma.dao.minibank.ProductDao#actionSaveProduct(id.co.telkomsigma.model.minibank.Product)
	 */
	@Override
	public void actionSaveProduct(Product product) {
		
		if(product!=null){
			getHibernateTemplate().saveOrUpdate(product);
			getHibernateTemplate().flush();
		}	

	}

}
