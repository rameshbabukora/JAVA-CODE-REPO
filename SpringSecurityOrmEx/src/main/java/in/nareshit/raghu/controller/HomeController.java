package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/welcome")
	public String showWelcomePage() {
		return "WelcomePage";
	}
	
	@GetMapping("/home")
	public String showHomePage() {
		return "HomePage";
	}
	
	@GetMapping("/emp")
	public String showEmpPage() {
		return "EmpPage";
	}
	
	@GetMapping("/adm")
	public String showAdminPage() {
		return "AdminPage";
	}
	
	@GetMapping("/std")
	public String showStdPage() {
		return "StudentPage";
	}
	
	@GetMapping("/denied")
	public String showDeniedPage() {
		return "DeniedPage";
	}
	
}