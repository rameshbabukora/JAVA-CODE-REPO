package in.nareshit.raghu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.consumer.DepartmentRestConsumer;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	
	@Autowired
	private DepartmentRestConsumer consumer;

	@GetMapping("/data")
	public ResponseEntity<String> showData() {
		return new ResponseEntity<String>("FROM EMP ==> " + consumer.geteDataFromDept(), HttpStatus.OK);
	}
}
