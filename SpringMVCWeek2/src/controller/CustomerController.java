package controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	// customer/100
	// customer/101
	// customer/102
	// ... n tane endpoint tanimlamamiz gerekli!!!
	// bu durum mumkun degildir!!!
	// bize dinamik bir tanimlama gerekli!

	@RequestMapping("/query")
	// http://localhost:8080/SpringMVCWeek02/customers/query?name=zuleyha
	public String customerByName(@RequestParam("name") String name, Model model) {
		model.addAttribute("message", name);
		return "customerPage";
	}
 
	@RequestMapping("/query2")
	// http://localhost:8080/SpringMVCWeek02/customers/query2?name=zuleyha
	// surname icin required false yaptik!
	
	// http://localhost:8080/SpringMVCWeek02/customers/query2?name=zuleyha&surname=kaya
	public String customerByNameAndSurname(@RequestParam("name") String name,
			@RequestParam(value = "surname", required = false) String surname, Model model) {
		model.addAttribute("message", name + " , " + surname);
		return "customerPage";
	}
	
	
	@RequestMapping("/matrixVariable/{filter}")
	// check java based matrix variable
	public String matrixVariable(@MatrixVariable(pathVar = "filter") Map<String, List<String>> matrixVariables,
			Model model) {
		model.addAttribute("message", matrixVariables);
		return "customerPage";
	}
}
