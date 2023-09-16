package in.nareshit.raghu.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Book;
import in.nareshit.raghu.repo.BookRepository;

@Component
public class BookPageRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	
	public void run(String... args) throws Exception {
		//Pagination input (number,size)
		Pageable pageable = PageRequest.of(0, 3);
		
		//execute
		Page<Book> page = repo.findAll(pageable);
		
		//print data
		if(page.hasContent()) {
			List<Book> list = page.getContent();
			list.forEach(System.out::println);
		} else {
			System.out.println("Given page not exist");
		}
		//---------------meta data-------------
		System.out.println("HAVIG DATA? " + page.hasContent());
		System.out.println("IS EMPTY? " + page.isEmpty());
		System.out.println("IS FIRST? " + page.isFirst());
		System.out.println("IS LAST? " + page.isLast());
		System.out.println("HAS NEXT? " + page.hasNext());
		System.out.println("HAS PREVIOUS? " + page.hasPrevious());
		System.out.println("TOTAL PAGES? " + page.getTotalPages());
		System.out.println("TOTAL ROWS? " + page.getTotalElements());
		System.out.println("CURRENT PAGE NUMBER? " + page.getNumber()); 
	}

}
