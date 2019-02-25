package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/products")
public class ProductController {
	
	    // /category/laptop
		// /category/tablet
		// /category/tv
		// category/mobilephone
		// ...
		// her birine karsilik bir method YAZAMAYIZ!!!!
		//
		//
//		@RequestMapping("/category/laptop")
//		private String laptops(Model model) {
//			//
//			//
//			model.addAttribute("data", null);
//			return "";
//		}
	//	
//		@RequestMapping("/category/tablet")
//		private String tablets(Model model) {
//			//
//			//
//			model.addAttribute("data", null);
//			return "";
//		}
	//	
//		@RequestMapping("/category/tv")
//		private String tvs(Model model) {
//			//
//			//
//			model.addAttribute("data", null);
//			return "";
//		}
	//	
//		// sonsuz tane endpoint gerekebilir!!!
	
	//http://localhost:8080/SpringMVCWeek2/products/category/tv
	
	@RequestMapping("/category/{categoryName}")
	public String categoryByName(@PathVariable("categoryName") String categoryName,Model model) {
		model.addAttribute("messageCategoryName",categoryName);
		return "productPage";
		
	}
	
	@RequestMapping("/category/{day}/{month}")
	public String category(@PathVariable ("day") String day,@PathVariable("month")String month,Model model) {
		model.addAttribute("messageCategoryName",day+" "+month);
		
		return "productPage";
	}
	
	
	// @PathVariable
	
		// Request Parameter
		// @RequestParam
		
		// /path?queryParam=value&queryParam2=value2&queryParam=value3
		
		
		// @MatrixVariable
		// complex, fazla sayidaki uri parameterlerini yonetmek icin kullanabiliriz.
		// /path/ matrixParam1=value1,value2,value; matrixParam2=valuek,valuej...
		

}
