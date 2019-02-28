package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ProductRepository;
import model.Product;
@Service
public class ProductServiceImpl  implements ProductService{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		
		return productRepository.getAllProducts();
	}

	@Override
	public Product getProductById(String productId) {
		// TODO Auto-generated method stub
		return productRepository.getProductById(productId);
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		// TODO Auto-generated method stub
		return productRepository.getProductByCategory(category);
	}

	@Override
	public List<Product> getProductByBrands(List<String> brands) {
		// TODO Auto-generated method stub
		return productRepository.getProductByBrands(brands);
	}

}
