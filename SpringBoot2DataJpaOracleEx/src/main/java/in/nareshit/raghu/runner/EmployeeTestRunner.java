package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class EmployeeTestRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		Employee emp = new Employee();
		emp.setEmpId(999);
		emp.setEmpName("SYED");
		emp.setEmpSal(3250.0);
		repo.save(emp);
	}

}
