package in.nareshit.raghu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.entity.Student;
import in.nareshit.raghu.service.StudentService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/create")
	public Mono<Student> saveStudent(@RequestBody Student student) 
	{
		return service.save(student);
	}
	
	@GetMapping("/find/{id}")
	public Mono<Student> fetchOneStudent(@PathVariable String id) 
	{
		return service.getOne(id);
	}
	
	@GetMapping("/all")
	public Flux<Student> fetchAllStudents() 
	{
		return service.findAll();
	}
	
	@DeleteMapping("/remove/{id}")
	public Mono<Void> removeOneStudent(@PathVariable String id) 
	{
		return service.delete(id);
	}
	
}
