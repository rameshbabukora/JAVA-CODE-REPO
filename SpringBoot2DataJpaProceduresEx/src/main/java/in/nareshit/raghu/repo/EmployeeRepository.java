package in.nareshit.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import in.nareshit.raghu.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//no input and no output
	@Query(value = "{call GET_ALL_EMPS()}",nativeQuery = true)
	List<Employee> getAllEmps();
	
	//no input and no output
	@Query(value = "{call GET_EMPS_BY_DESG(?)}",nativeQuery = true)
	List<Employee> getAllEmpsByDesg(String desg);
	
	// with input and with output
	@Procedure("GET_EMPS_COUNT_DEPT")
	Integer getEmployeesByDept(String dept);
}
