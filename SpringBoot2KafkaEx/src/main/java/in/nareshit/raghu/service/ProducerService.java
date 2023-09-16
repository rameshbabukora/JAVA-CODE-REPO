package in.nareshit.raghu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ProducerService {

	@Autowired
	private KafkaTemplate<String, String> template;
	
	@Value("${my.app.tpc-name}")
	private String topicName;
	
	public void sendQuote(String message) {
		log.info("Data at Producer is {}",message);
		template.send(topicName, message);
	}
	
}
