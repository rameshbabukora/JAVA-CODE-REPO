package in.nareshit.raghu.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.entity.Quote;
import in.nareshit.raghu.service.ProducerService;
import in.nareshit.raghu.store.MessageStore;
import in.nareshit.raghu.util.JsonUtil;

@RestController
@RequestMapping("/qoute")
public class QuoteRestController {

	@Autowired
	private ProducerService service;
	
	@Autowired
	private MessageStore store;
	
	@Autowired
	private JsonUtil jsonUtil;
	
	
	@GetMapping("/create/{code}/{cost}")
	public ResponseEntity<String> createQuote(
			@PathVariable String code,
			@PathVariable Double cost
			) 
	{
		//create obj
		Quote q = new Quote();
		q.setCode(code);
		q.setCost(cost);
		q.setTxDate(new Date());
		
		//convert to JSON
		String json = jsonUtil.toJson(q);
		
		//call producer 
		service.sendQuote(json);
		
		return ResponseEntity.ok("Created!!");
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Quote>> fetchAll() {
		List<Quote> list = store.getAll();
		return ResponseEntity.ok(list);
	}
}
