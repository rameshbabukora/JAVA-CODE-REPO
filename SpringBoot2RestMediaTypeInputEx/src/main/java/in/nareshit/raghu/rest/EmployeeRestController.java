package in.nareshit.raghu.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@PostMapping("/save")
	public String createEmployee(
			@RequestBody Employee employee 
			) 
	{
		return "CREATED! " + employee;
	}
}
