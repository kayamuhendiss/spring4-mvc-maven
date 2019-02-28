package controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="controller,dao,service,model")
@RequestMapping("/flash")
public class FlashController {
	
	@RequestMapping("/list")
	public String welcome(ModelMap modelMap,RedirectAttributes redirectAttributes) {
		modelMap.addAttribute("greeting","Welcome Web Store");
		modelMap.addAttribute("tagline","The one and only amazing Web Store ");
		redirectAttributes.addFlashAttribute("greeting","Welcome Web Store");
		redirectAttributes.addFlashAttribute("tagline","The one and only amazing Web Store ");
		return "redirect:/flash/greeting";
	}
	@RequestMapping("/greeting")
	public String greeting(ModelMap modelMap) {
		return "customerPage";
	}

}
