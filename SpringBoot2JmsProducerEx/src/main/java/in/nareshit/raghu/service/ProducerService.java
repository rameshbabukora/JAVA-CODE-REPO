package in.nareshit.raghu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerService {

	@Value("${my.app.desti-name}")
	private String destination;

	@Autowired
	private JmsTemplate jt;

	public void sendMessage(String message) {
		/*jt.send(destination, new MessageCreator() {
			public Message createMessage(Session session) 
					throws JMSException
			{
				return session.createTextMessage(message);
			}
		});*/
		jt.send(destination,session -> session.createTextMessage(message));
	}
}
