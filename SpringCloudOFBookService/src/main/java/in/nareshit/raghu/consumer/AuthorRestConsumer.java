package in.nareshit.raghu.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("AUTHOR-SERVICE")
public interface AuthorRestConsumer {

	@GetMapping("/author/show")
	public ResponseEntity<String> showAuthData();
}
