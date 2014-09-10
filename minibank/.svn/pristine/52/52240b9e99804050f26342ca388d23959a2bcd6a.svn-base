package id.co.telkomsigma.dao.minibank;

import java.util.List;

import id.co.telkomsigma.dao.BaseDaoTestCase;
import id.co.telkomsigma.dao.minibank.ProductDao;
import id.co.telkomsigma.model.minibank.Product;

public class ProductDaoTest extends BaseDaoTestCase {

	private ProductDao productDao;

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void testActionGetProduct(){
		
		Product product = new Product();
		product.setName("Tabungan");
		product.setPrice(Double.valueOf("2000000"));
		product.setRemark("Minimum Saldo 200000");
		product.setProductEnable(true);
		
		this.getProductDao().actionSaveProduct(product);
		Long productSaveId = product.getId();
		assertNotNull(productSaveId);
		Product productRetrieved = this.getProductDao().actionGetProduct(productSaveId);
		assertNotNull(productRetrieved);
		System.out.println(productRetrieved);
	}

	public void testActionGetAll(){
		
		Product product = new Product();
		product.setName("Tabungan");
		product.setPrice(Double.valueOf("2000000"));
		product.setRemark("Minimum Saldo 200000");
		product.setProductEnable(true);
		
		this.getProductDao().actionSaveProduct(product);
		List<Product> productList = this.getProductDao().getAllProduct();
		assertNotNull(productList);
	}
	
	public void testActionSaveProduct(){
	
		Product product = new Product();
		product.setName("Kartu Kredit");
		product.setPrice(Double.valueOf("2000000"));
		product.setRemark("Minimum Saldo 200000");
		product.setProductEnable(true);
		this.getProductDao().actionSaveProduct(product);
		Long productSaveId = product.getId();
		assertNotNull(productSaveId);
		Product productRetrieved = this.getProductDao().actionGetProduct(productSaveId);
		assertNotNull(productRetrieved);
		System.out.println(productRetrieved);
	}
	
}
