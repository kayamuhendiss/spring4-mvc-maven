package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.Product;
import service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping()
	public String getAllProducts(ModelMap modelMap) {
		modelMap.addAttribute("products",productService.getAllProducts());
		return "jsp/productList";
	}
	
	
	@RequestMapping("/all")
	public ModelAndView listAllProducts() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("jsp/productList");
		modelAndView.addObject("products",productService.getAllProducts());
		return modelAndView;
	}
	
	@RequestMapping("/category/{categoryName}")
	public String getProductByCategory(@RequestParam("categoryName") String categoryName,Model model) {
	model.addAttribute("products",productService.getProductByCategory(categoryName));
	return "jsp/productList";
		
	}
	@RequestMapping("/product")
	public String getProductById(@RequestParam(name="id" ,required=false)String id,Model model ) {
		model.addAttribute("product",productService.getProductById(id));
		return "jsp/productDetail";
	}
	
	@RequestMapping("/brands/{brands}")
	public String getProductByBrands(@MatrixVariable(pathVar="brands")List<String> maxList,Model model ) {
		
		model.addAttribute("products",productService.getProductByBrands(maxList));
		return "jsp/productList";
	}

}
