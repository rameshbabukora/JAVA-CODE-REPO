package in.nareshit.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudCsNativeConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCsNativeConfigServerApplication.class, args);
	}

}
