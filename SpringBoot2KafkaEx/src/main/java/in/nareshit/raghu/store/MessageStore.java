package in.nareshit.raghu.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.entity.Quote;
import in.nareshit.raghu.repo.QuoteRepository;
import in.nareshit.raghu.util.JsonUtil;

@Service
public class MessageStore {

	@Autowired
	private QuoteRepository repo;
	
	@Autowired
	private JsonUtil util;
	
	public void save(String message) {
		Quote quote = util.fromJson(message);
		repo.save(quote);
	}
	
	public List<Quote> getAll() {
		return repo.findAll();
	}
}
