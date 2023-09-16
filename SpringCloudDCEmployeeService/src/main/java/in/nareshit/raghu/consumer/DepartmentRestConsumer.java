package in.nareshit.raghu.consumer;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class DepartmentRestConsumer {

	@Autowired
	private DiscoveryClient client;
	
	public String geteDataFromDept() {
		System.out.println(client.getClass().getName());
		// GET DATA FROM EUREKA SERVER BASED ON SERVICEID
		List<ServiceInstance> list = client.getInstances("DEPARTMENT-SERVICE");
		
		//read SI from index#0
		ServiceInstance si  = list.get(0);
		
		//Read URI FROM SI
		URI uri = si.getUri();
		
		//create URL
		String url = uri + "/dept/data";
		
		//use RestTemplate 
		RestTemplate rt = new RestTemplate();
		
		//make HTTP call
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		
		return response.getBody();
	}
}
