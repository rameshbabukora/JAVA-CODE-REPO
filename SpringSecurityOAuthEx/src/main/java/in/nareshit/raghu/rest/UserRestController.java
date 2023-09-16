package in.nareshit.raghu.rest;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping("/all")
	public String showAll() {
		return "Welcome to All!";
	}
	
	@GetMapping("/data")
	public String showData() {
		return "Welcome to Login user only!";
	}
	
	@GetMapping("/info")
	public Authentication showUser(Principal p) {
		System.out.println(p.getClass().getName());
		return SecurityContextHolder.getContext().getAuthentication();
	}
	
}
