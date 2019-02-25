package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/orders")
public class OrderController {
	
	@RequestMapping(value="/testMethod1",method = RequestMethod.GET)
	public String testMethod(Model model) {
		model.addAttribute("message","OrderController#testMethod1");
		return "orderPage";
		
	}
	@RequestMapping("/testMethod2")
	public ModelAndView testMethod2() {
		ModelAndView mAndView=new ModelAndView();
		mAndView.setViewName("orderPage");
		mAndView.addObject("message","OrderController#testMethod2");
		return mAndView;
	}
	
	@RequestMapping("/testMethod3")
	public String testMethod3(ModelMap modelMap) {
		modelMap.addAttribute("message","OrderController#testMethod3");
		return "orderPage";
		
	}
	//http://localhost:8080/SpringMVCWeek2/orders
	//defaultRequestMapping 
	@RequestMapping
	public String testMethod4(ModelMap modelMap) {
		modelMap.addAttribute("message","OrderController#testMethod4");
		return "orderPage";
		
	}
	 
	
	
	
	
	
	
	
	

}
