package in.nareshit.raghu.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorRestController {

	@Value("${server.port}")
	private String port;
	
	@GetMapping("/show")
	public ResponseEntity<String> showAuthData() {
		return new ResponseEntity<String>("FROM AUTHOR--"+port,HttpStatus.OK);
	}
	
}
