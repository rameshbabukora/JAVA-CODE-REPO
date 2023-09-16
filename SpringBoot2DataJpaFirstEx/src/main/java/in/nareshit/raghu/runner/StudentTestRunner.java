package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Student;
import in.nareshit.raghu.repo.StudentRepository;

@Component
public class StudentTestRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;
	
	public void run(String... args) throws Exception {
		Student sob = new Student();
		sob.setStdId(101);
		sob.setStdName("SAMPLE");
		sob.setStdFee(200.0);
		repo.save(sob);
	}

}
