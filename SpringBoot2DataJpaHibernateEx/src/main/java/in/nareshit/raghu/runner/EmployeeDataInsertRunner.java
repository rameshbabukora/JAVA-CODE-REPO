package in.nareshit.raghu.runner;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class EmployeeDataInsertRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\Images\\emp.jpg");
		byte[] img = new byte[fis.available()];
		fis.read(img);
		
		String descStr = "Hello!, welcome to HYD, sample, abcdefgHello!, welcome to HYD, sample, abcdefgHello!, welcome to HYD, sample, abcdefgHello!, welcome to HYD, sample, abcdefgHello!, welcome to HYD, sample, abcdefgHello!, welcome to HYD, sample, abcdefgHello!, welcome to HYD, sample, abcdefg";
		char[] desc = descStr.toCharArray();
		
		Employee emp = new Employee(101,"AAA", 200.0, img, desc);
		
		repo.save(emp);
		fis.close();
	}

}
