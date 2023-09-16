package in.nareshit.raghu.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DepartmentRestController {

	@GetMapping("/data")
	public ResponseEntity<String> showDeptMsg() {
		return new ResponseEntity<String>("FROM DEPT",HttpStatus.OK);
	}
}
