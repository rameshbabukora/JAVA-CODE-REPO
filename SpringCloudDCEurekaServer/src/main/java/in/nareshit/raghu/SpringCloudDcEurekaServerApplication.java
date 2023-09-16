package in.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudDcEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDcEurekaServerApplication.class, args);
	}

}
