package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import in.nareshit.raghu.entity.Employee;
import in.nareshit.raghu.entity.Project;
import in.nareshit.raghu.repo.EmployeeRepository;
import in.nareshit.raghu.repo.ProjectRepository;

//@Component
public class TestInsertRunner implements CommandLineRunner {
	
	@Autowired
	private ProjectRepository prepo;
	
	@Autowired
	private EmployeeRepository erepo;

	public void run(String... args) throws Exception {

		// many rows in Employee table are connected with 1 row in project table
				
		Project p1 = new Project(110, "P-HTC", "NMO", 3.2);
		Project p2 = new Project(112, "P-ORC", "NIT", 1.0);
		Project p3 = new Project(113, "P-TEST", "XYZ", 1.0);
		Project p4 = new Project(114, "P-SAMP", "NIT", 2.0);
		
		prepo.save(p1);
		prepo.save(p2);
		prepo.save(p3);
		prepo.save(p4);
		
		Employee e1 = new Employee(50, "AA", "DEV", p1);
		Employee e2 = new Employee(51, "BA", "DEV", p3);
		Employee e3 = new Employee(52, "CA", "QA", p1);
		
		Employee e4 = new Employee(53, "NN", "DEV", null);
		Employee e5 = new Employee(54, "RR", "QA", p2);
		
		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		erepo.save(e4);
		erepo.save(e5);
		
	}

}
