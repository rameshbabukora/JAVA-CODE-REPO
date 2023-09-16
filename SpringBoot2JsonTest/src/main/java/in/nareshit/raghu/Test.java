package in.nareshit.raghu;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.nareshit.raghu.bean.Address;
import in.nareshit.raghu.bean.Student;

public class Test {

	public static void main(String[] args) {
		try {
			Map<String,Integer> codes = new LinkedHashMap<>();
			codes.put("C1", 9501);
			codes.put("C2", 2651);
			codes.put("C3", 3600);
			
			Student s = new Student(101, "AJAY", "ABCD", 
					Arrays.asList("CJ","AJ","SBMS"),
					codes,
					new Address("9-4/A", "AMEERPET")
					);
			
			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(s);
			
			System.out.println(json);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
