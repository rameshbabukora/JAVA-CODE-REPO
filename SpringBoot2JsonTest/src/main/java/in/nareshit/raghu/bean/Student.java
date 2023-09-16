package in.nareshit.raghu.bean;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	private Integer sid;
	private String sname;
	
	@JsonIgnore
	private String password;
	
	private List<String> course;
	//private Set<String> course;
	//private String[] course;
	
	private Map<String,Integer> codes;
	
	private Address addr; //HAS-A
	
}
