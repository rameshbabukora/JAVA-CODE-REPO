package in.nareshit.raghu.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Student;
import in.nareshit.raghu.repo.StudentRepository;

@Component
public class TestFetchRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;
	
	public void run(String... args) throws Exception {
		Optional<Student> opt = repo.findById(501);
		System.out.println("DONE");
	}

}
