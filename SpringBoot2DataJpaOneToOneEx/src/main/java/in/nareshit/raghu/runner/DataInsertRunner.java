package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Employee;
import in.nareshit.raghu.entity.Profile;
import in.nareshit.raghu.repo.EmployeeRepository;
import in.nareshit.raghu.repo.ProfileRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository erepo;
	
	@Autowired
	private ProfileRepository prepo;
	
	public void run(String... args) throws Exception {
		Profile p1 = new Profile(660, "DEV", 5.1, "SSE");
		Profile p2 = new Profile(661, "QA", 7.1, "SQE");
		
		prepo.save(p1);
		prepo.save(p2);
		
		erepo.save(new Employee(101,"AA", 3.2, p1));
		erepo.save(new Employee(102,"BB", 8.2, p2));
	}

}
