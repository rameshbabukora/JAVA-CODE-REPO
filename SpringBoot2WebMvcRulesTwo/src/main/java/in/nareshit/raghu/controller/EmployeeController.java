package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@GetMapping("/show")
	public String showHome() {
		System.out.println("FROM GET OK");
		return "EmpHome";
	}
	
}
