package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import in.nareshit.raghu.entity.Book;
import in.nareshit.raghu.repo.BookRepository;

//@Component
public class BookDataInsertRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	
	public void run(String... args) throws Exception {
		repo.save(new Book(10, "Core Java", 200.0));
		repo.save(new Book(11, "Adv Java", 500.0));
		repo.save(new Book(12, "Boot", 500.0));
		repo.save(new Book(13, "Microservices", 500.0));
		repo.save(new Book(14, "Angular", 500.0));
		repo.save(new Book(15, "ReactJS", 150.0));
		repo.save(new Book(16, "HTML/CSS", 50.0));
	}

}
