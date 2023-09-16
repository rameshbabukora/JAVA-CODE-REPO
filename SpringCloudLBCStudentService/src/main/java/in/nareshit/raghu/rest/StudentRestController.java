package in.nareshit.raghu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.consumer.CourseRestConsumer;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	@Autowired
	private CourseRestConsumer consumer;
	
	@GetMapping("/data")
	public ResponseEntity<String> getData() {
		return new ResponseEntity<String>(
				"STUDENT==>" + consumer.getCourseData(), 
				HttpStatus.OK);
	}
}
