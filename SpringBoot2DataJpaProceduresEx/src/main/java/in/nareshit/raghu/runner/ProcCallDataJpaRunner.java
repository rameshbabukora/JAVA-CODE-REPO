package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class ProcCallDataJpaRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		/**
		 * case#1 No Input and No Output
		 */
		//using Data JPA
		repo.getAllEmps().forEach(System.out::println);
		
		/**
		 * case#2 with Input and No Output
		 */
		//Data JPA
		repo.getAllEmpsByDesg("SE").forEach(System.out::println);
		
		/***
		 * case#3
		 */
		// using Data JPA
		int count = repo.getEmployeesByDept("DEV");
		System.out.println(count);
		
		
	}

}
