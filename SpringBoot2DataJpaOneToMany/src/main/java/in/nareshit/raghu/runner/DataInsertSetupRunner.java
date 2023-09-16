package in.nareshit.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import in.nareshit.raghu.entity.Address;
import in.nareshit.raghu.entity.Student;
import in.nareshit.raghu.repo.AddressRepository;
import in.nareshit.raghu.repo.StudentRepository;

//@Component
public class DataInsertSetupRunner implements CommandLineRunner {

	@Autowired
	private AddressRepository arepo;
	@Autowired
	private StudentRepository srepo;
	
	@Override
	public void run(String... args) throws Exception {

		Address a1 = new Address(10, "4-65/B", "AMEERPET", 500013L);
		Address a2 = new Address(11, "32/F-102", "SR NAGAR", 500014L);
		
		Student s1 = new Student(501, "SAM", "Core Java", Arrays.asList(a1,a2));
		
		/*arepo.save(a1);
		arepo.save(a2);*/
		
		srepo.save(s1);
		
		Address a3 = new Address(12, "9-05/T", "KYTP", 500063L);
		Address a4 = new Address(13, "14-15/8A", "RNJG", 500044L);
		
		Student s2 = new Student(502, "SYED", "Adv Java", Arrays.asList(a3,a4));
		
		/*arepo.save(a3);
		arepo.save(a4);*/
		
		srepo.save(s2);
		
	}

}
