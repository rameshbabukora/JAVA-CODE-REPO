package in.nareshit.raghu.repo;

import org.springframework.data.repository.CrudRepository;

import in.nareshit.raghu.entity.Student;

public interface StudentRepository 
	extends CrudRepository<Student, Integer> {

}
