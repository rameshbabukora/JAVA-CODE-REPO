package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import in.nareshit.raghu.entity.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;

//@Component
public class EmployeeInsertRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		repo.save(new Employee(101, "AA", 200.0, "DEV", "SE"));
		repo.save(new Employee(102, "AB", 250.0, "DEV", "SE"));
		repo.save(new Employee(103, "AC", 280.0, "QA", "SQE"));
		repo.save(new Employee(104, "BA", 300.0, "QA", "MQE"));
		repo.save(new Employee(105, "BB", 210.0, "BA", "TBR"));
		repo.save(new Employee(106, "BC", 290.0, "BA", "TBR"));
		
	}

}
