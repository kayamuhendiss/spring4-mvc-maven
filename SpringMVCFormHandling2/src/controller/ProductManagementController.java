package controller;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import model.Product;
import service.ProductService;

@Controller
@EnableWebMvc
public class ProductManagementController {
	
	@Autowired 
	private ProductService productService;
	
	@InitBinder
	public void initialiseBinder(WebDataBinder binder) {
		binder.setAllowedFields("productId","name","unitPrice","description","manufacturer","category","condition","unitsInStock");
	}
	
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String getNewProductForm(@ModelAttribute("newProduct")Product newProduct) {
		 newProduct.setCondition("new");
		 newProduct.setCategory("Tablet");
		 newProduct.setManufacturer("Samsung");
		 return "jsp/productAdd";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String processGetNewProductForm(@ModelAttribute("newProduct")Product productToBeAdded,BindingResult result,HttpServletRequest request) {
		
		String []suppressedFields=result.getSuppressedFields();
		if (suppressedFields.length>0) {
			throw new RuntimeException("Attempting to bind disallowed fileds: "
		+org.springframework.util.StringUtils.arrayToCommaDelimitedString(suppressedFields));
			
			
		}
		
		
	productService.addProduct(productToBeAdded);
	return "redirect:/products";
		
	}
	
	
	@ModelAttribute("manufacturerList")
	public List<String> manufacturerList(){
		return Arrays.asList("Apple", "Google", "Samsung");
	}
	
	@ModelAttribute("categoryList")
	public List<String> prepareCategoryList() {
		return Arrays.asList("Laptop", "Tablet", "SmartPhone");
	}

	// referenceData
	@ModelAttribute("conditionMap")
	public Map<String, String> prepareConditionMap() {
		Map<String, String> conditions = new HashMap<String, String>();
		conditions.put("new", "New");
		conditions.put("old", "Old");
		conditions.put("refurbished", "Refurbished");
		return conditions;
	}
}

