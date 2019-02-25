package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.HelloService1;

@Controller
@RequestMapping("/url")
public class HelloController1 {
	@Autowired
	private HelloService1 helloService1;
	
	@RequestMapping(value="/hello1",method = RequestMethod.GET)
	public String viewYolla(ModelMap modelmap) {
		String nameString=helloService1.getNamee();
		modelmap.addAttribute("message",nameString);
		return "hello1";
	}
	@RequestMapping(value="/hello2",method = RequestMethod.GET)
	public String viewYolla2(ModelMap modelmap) {
		String nameString2=helloService1.getNamee();
		modelmap.addAttribute("message2",nameString2);
		return "hello2";
	}
	
	

}
