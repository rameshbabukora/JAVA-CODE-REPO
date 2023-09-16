package in.nareshit.raghu.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class DataFetchRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		//repo.getDataA()
		//repo.getDataB()
		//repo.getDataC()
		/*repo.getDataD()
		.stream()
		.map(ob->ob[0]+"-"+ob[1]) //Object[]->String
		.forEach(System.out::println);*/ //print
		
		//System.out.println(repo.getDataA());
		List<Object[]> list = repo.getDataA();
		for(Object[] ob:list) {
			String s = ob[0]+"-"+ob[1];
			System.out.println(s);
		}
	}

}
