package id.co.telkomsigma.service.impl.minibank;

import id.co.telkomsigma.dao.minibank.ProductDao;
import id.co.telkomsigma.model.minibank.Product;
import id.co.telkomsigma.service.impl.BaseManager;
import id.co.telkomsigma.service.minibank.ProductManager;

import java.util.List;


public class ProductManagerImpl extends BaseManager implements ProductManager {
	
	private ProductDao productDao;
	
	

	/**
	 * @return the productDao
	 */
	public ProductDao getProductDao() {
		return productDao;
	}

	/**
	 * @param productDao the productDao to set
	 */
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public Product actionGetProduct(Long productId) {
		return this.getProductDao().actionGetProduct(productId);
	}

	@Override
	public List<Product> getAllProduct() {
		return this.getProductDao().getAllProduct();
	}

	@Override
	public void actionSaveProduct(Product product) {
		this.getProductDao().actionSaveProduct(product);
	}

}
