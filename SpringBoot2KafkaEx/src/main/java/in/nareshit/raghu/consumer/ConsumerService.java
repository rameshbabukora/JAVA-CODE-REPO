package in.nareshit.raghu.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.store.MessageStore;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ConsumerService {

	@Autowired
	private MessageStore store;
	
	@KafkaListener(topics="${my.app.tpc-name}")
	public void readData(String message) {
		log.info("Message at Consumer {}",message);
		store.save(message);
	}
}
