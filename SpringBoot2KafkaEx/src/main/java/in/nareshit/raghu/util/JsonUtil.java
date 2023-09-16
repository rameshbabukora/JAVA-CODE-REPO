package in.nareshit.raghu.util;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.nareshit.raghu.entity.Quote;

@Component
public class JsonUtil {

	public String toJson(Quote quote) {
		String json = null;
		try {
			json = new ObjectMapper()
					.writeValueAsString(quote);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}

	public Quote fromJson(String json) {
		Quote quote = null;
		try {
			quote = new ObjectMapper()
					.readValue(json, Quote.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return quote;
	}
}
