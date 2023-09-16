package in.nareshit.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Book;
import in.nareshit.raghu.repo.BookRepository;

@Component
public class BookTestRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	
	public void run(String... args) throws Exception {
		/*
		 * Book b1 = new Book(101, "A", 200.0); repo.save(b1);
		 */
		/*repo.save(new Book(101, "A", 200.0)); //SELECT-> INSERT
		repo.save(new Book(101, "B", 300.0)); //SELECT-> UPDATE*/
		
		/*repo.saveAll(
				Arrays.asList(
						new Book(101, "A", 200.0),
						new Book(102, "B", 300.0),
						new Book(103, "C", 400.0),
						new Book(103, "E", 800.0),
						new Book(104, "D", 500.0)
						)
				);*/
		//Iterable<Book> itr = repo.findAll();
		//print using iterator
		/*Iterator<Book> it = itr.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			System.out.println(book);
		}*/
		
		//JDK 1.5 forEach method
		/*List<Book> list = (List<Book>) itr;
		for(Book book:list) {
			System.out.println(book);
		}*/
		
		//Java 8 forEach using method Ref
		//itr.forEach(System.out::println);
		
		//Java 8 forEach using lmabda exp
		//itr.forEach(ob->System.out.println(ob));
		
		//Java 8 Stream
		/*List<Book> list = (List<Book>) itr;
		list
		.stream()
		.filter(ob->ob.getBookCost()>=300.0)
		.sorted((ob1,ob2)->ob2.getBookName().compareTo(ob1.getBookName()))
		.map(ob->"Book : "+ ob.getBookName()+" cost is => " + ob.getBookCost()+", having id=>"+ob.getBookId())
		.forEach(System.out::println);*/
		
		/*System.out.println(repo.existsById(104));
		System.out.println(repo.existsById(119));
		*/
		repo.findAllById(Arrays.asList(101,103,105,119,125))
		.forEach(System.out::println);
		
		
	}

}
