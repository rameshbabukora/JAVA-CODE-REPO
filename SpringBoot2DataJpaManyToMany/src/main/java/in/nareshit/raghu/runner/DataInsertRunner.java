package in.nareshit.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Course;
import in.nareshit.raghu.entity.Student;
import in.nareshit.raghu.repo.CourseRepository;
import in.nareshit.raghu.repo.StudentRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository srepo;
	@Autowired
	private CourseRepository crepo;
	
	@Override
	public void run(String... args) throws Exception {
		Course c1 = new Course(100, "Core Java", 1000.0);
		Course c2 = new Course(101, "Adv Java", 1500.0);
		Course c3 = new Course(102, "Hibernate", 2500.0);
		Course c4 = new Course(103, "Boot and MS", 3500.0);
		
		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);
		crepo.save(c4);
		
		Student s1 = new Student(51, "SAM", "HYD", Arrays.asList(c2,c4));
		Student s2 = new Student(52, "SYED", "BAN", Arrays.asList(c1,c3));
		Student s3 = new Student(53, "RAM", "DHL", Arrays.asList(c1,c4));
		Student s4 = new Student(54, "AJAY", "MUM", Arrays.asList(c2,c3));
		
		srepo.save(s1);
		srepo.save(s2);
		srepo.save(s3);
		srepo.save(s4);
	}

}
