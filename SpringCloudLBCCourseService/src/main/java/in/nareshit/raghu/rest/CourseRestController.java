package in.nareshit.raghu.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseRestController {
	
	@Value("${server.port}")
	private String port;

	@GetMapping("/msg")
	public String showMsg() {
		return "FROM COURSE ==> " + port;
	}
	
}
