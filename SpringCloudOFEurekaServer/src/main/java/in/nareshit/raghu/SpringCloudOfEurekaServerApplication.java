package in.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudOfEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOfEurekaServerApplication.class, args);
	}

}
