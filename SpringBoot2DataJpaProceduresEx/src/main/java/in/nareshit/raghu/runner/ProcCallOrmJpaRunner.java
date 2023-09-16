package in.nareshit.raghu.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Employee;

@Component
public class ProcCallOrmJpaRunner implements CommandLineRunner {

	@Autowired
	private EntityManager em;
	
	
	public void run(String... args) throws Exception {
		/**
		 * case#1 No Input and No Output
		 */
		
		// using ORM JPA
		
		//1. Create StoredProcedureQuery
		StoredProcedureQuery query = em.createStoredProcedureQuery("GET_ALL_EMPS",Employee.class);
		
		//2. register input and output params
		//3. provide data for input params
		
		//4. Execute and print result
		List<Employee> list =  query.getResultList();
		list.forEach(System.out::println);
		
	
		/**
		 * case#2 with Input and No Output
		 */
		
		//ORM JPA
		/*
		//1. Create StoredProcedureQuery
		StoredProcedureQuery query = em.createStoredProcedureQuery("GET_EMPS_BY_DESG", Employee.class);
		
		//2. register input and output params
		//param name, datatype, mode(IN/OUT)
		query.registerStoredProcedureParameter("EMP_DESG", String.class, ParameterMode.IN);
		
		//3. provide data for input params
		query.setParameter("EMP_DESG", "SE");
		
		//4. Execute and print result
		List<Employee> list =  query.getResultList();
		list.forEach(System.out::println);
		*/
		/***
		 * case#3
		 */
		
		//using ORM JPA
		/*
		//1. Create StoredProcedureQuery
		StoredProcedureQuery query = em.createStoredProcedureQuery("GET_EMPS_COUNT_DEPT");
		//2. register input and output params
				//param name, datatype, mode(IN/OUT)
		query.registerStoredProcedureParameter("EMP_DEPT", String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter("dept_count", Integer.class, ParameterMode.OUT);
		
		//3. provide data for input params
		query.setParameter("EMP_DEPT", "DEV");
		
		//4. Execute and print result
		query.execute();
		
		Integer count = (Integer) query.getOutputParameterValue("dept_count");
		System.out.println(count);
		*/
	}

}
