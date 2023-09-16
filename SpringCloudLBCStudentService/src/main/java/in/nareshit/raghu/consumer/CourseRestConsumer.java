package in.nareshit.raghu.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CourseRestConsumer {

	@Autowired
	private LoadBalancerClient client;

	public String getCourseData() {
		System.out.println(client.getClass().getName());
		
		//fetch one SI from Eureka which has Less LF.
		ServiceInstance si = client.choose("COURSE-SERVICE");

		//read URI and add path
		String url = si.getUri() + "/course/msg";

		//make Request Call
		RestTemplate rt= new RestTemplate(); 
		ResponseEntity<String > response = rt.getForEntity(url, String.class);

		//return response
		return response.getBody();
	}
}
