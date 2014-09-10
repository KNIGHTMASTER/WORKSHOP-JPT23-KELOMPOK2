package id.co.telkomsigma.service.minibank;

import java.util.List;

import id.co.telkomsigma.model.minibank.Product;

public interface ProductManager {

	public Product actionGetProduct(Long productId);	
	
	public List<Product> getAllProduct();
	
	public void actionSaveProduct(Product product);
}
