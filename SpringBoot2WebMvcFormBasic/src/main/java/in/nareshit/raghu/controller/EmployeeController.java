package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.nareshit.raghu.model.Employee;

@Controller
public class EmployeeController {

	//1. show register page
	@GetMapping("/register")
	public String showReg() {
		return "EmpRegister";
	}
	
	//2. read form data
	@PostMapping("/save")
	public String saveEmp(
			@ModelAttribute Employee employee,
			Model model
			)
	{
		System.out.println(employee);
		model.addAttribute("eob", employee);
		return "EmpData";
	}
}
