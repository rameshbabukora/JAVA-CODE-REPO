package in.nareshit.raghu.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;

@Endpoint(id="sample")
//@Component
public class SampleEndoint {

	//GET   http://IP:PORT/basePath/sample
	@ReadOperation
	public Map<String,String> showData() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("S1", "ABC");
		map.put("S2", "XYZ");
		return map;
	}

	//POST  http://IP:PORT/basePath/sample
	@WriteOperation
	public String showDataB() {
		return "HELLO FROM POST";
	}

	//DELETE  http://IP:PORT/basePath/sample
	@DeleteOperation
	public String showDataC() {
		return "HELLO FROM DELETE";
	}
}
