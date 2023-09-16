package in.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudLbcCourseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLbcCourseServiceApplication.class, args);
	}

}
