package in.nareshit.raghu.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		/*repo.save(new Employee(101, "AA", 100.0));
		repo.save(new Employee(102, "BA", 200.0));
		repo.save(new Employee(103, "AC", 300.0));
		repo.save(new Employee(104, "DD", 400.0));
		
		repo.findAll().forEach(System.out::println);*/
		
		/*Optional<Employee> opt = repo.findById(103);
		if(opt.isPresent()) {
			Employee e = opt.get();
			System.out.println("Data is => " + e );
		} else {
			System.out.println("No Data Found");
		}
	
		System.out.println("COUNT =>" + repo.count());
		*/
		//repo.deleteById(103);
		//repo.deleteAllById(Arrays.asList(101,104));
		repo.deleteAll();
		System.out.println("DELETED!");
	
		
	}

}
