package in.nareshit.raghu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.consumer.AuthorRestConsumer;

@RestController
@RequestMapping("/book")
public class BookRestController {

	@Autowired
	private AuthorRestConsumer consumer;
	
	@GetMapping("/info")
	public ResponseEntity<String> showBookData() {
		System.out.println(consumer.getClass().getName());
		return new ResponseEntity<String>(
				"FROM BOOK==>" + consumer.showAuthData().getBody(),
				HttpStatus.OK);
	}
	
}

