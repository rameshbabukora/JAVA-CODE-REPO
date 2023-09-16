package in.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import in.nareshit.raghu.entity.Student;
import reactor.core.publisher.Mono;

@Component
public class ConsumerService implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		WebClient client = WebClient.create("http://localhost:8080/student");

		/*
		Flux<Student> response = 
				client.get()   //Method Type
				.uri("/all")  // URI/Path
				.retrieve()   //execute Request
				.bodyToFlux(Student.class); //map Response to a Type

		response.doOnNext(System.out::println).blockLast();
		 */

		/*Mono<Student> response = 
				client.post() //Method Type
				.uri("/create") // URI/Path
				.body(Mono.just(new Student("5604","TTTT", 500.0)),Student.class) //ReqBody, Type
				.retrieve() // execute request
				.bodyToMono(Student.class); //map Response to a Type

		response.subscribe(System.out::println);*/

		/*Mono<Student> response = 
				client.delete()
				.uri("/remove/{id}",5604)
				.retrieve()
				.bodyToMono(Student.class);
		response.subscribe(System.out::println);
		System.out.println("DONE");*/

		Mono<Student> response = 
				client.get()
				.uri("/find/{id}","61b74a895225953f02dc3776")
				.retrieve()
				.bodyToMono(Student.class);
		response.subscribe(System.out::println);


	}

}
