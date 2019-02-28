package service;

import java.util.List;

import model.Product;

public interface ProductService {
	
	public List<Product> getAllProducts();
	public Product getProductById(String productId);
	public List<Product> getProductByCategory(String category);
	public List<Product> getProductByBrands(List<String> brands);
	public void addProduct(Product product);

}
