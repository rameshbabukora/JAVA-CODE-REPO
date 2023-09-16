package in.nareshit.raghu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	
	@Autowired
	private RestTemplate rt;

	@GetMapping("/data")
	public String showData() {
		return "FROM - EMP";
	}
	
}
