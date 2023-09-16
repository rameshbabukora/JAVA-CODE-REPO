package in.nareshit.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nareshit.raghu.entity.User;
import in.nareshit.raghu.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService service;

	@GetMapping("/register")
	public String showRegisterPage() {
		return "UserRegister";
	}
	
	@PostMapping("/save")
	public String saveUser(
			@ModelAttribute User user,
			Model model
			) 
	{
		Integer id = service.saveUser(user);
		String message = "User '"+id+"' created!";
		model.addAttribute("message", message);
		return "UserRegister";
	}
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "LoginPage";
	}
}
