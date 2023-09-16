package in.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBoot2JmsProducerExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2JmsProducerExApplication.class, args);
	}

}
