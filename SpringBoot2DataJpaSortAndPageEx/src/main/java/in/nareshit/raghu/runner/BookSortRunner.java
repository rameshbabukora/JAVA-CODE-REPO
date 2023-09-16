package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import in.nareshit.raghu.repo.BookRepository;

//@Component
public class BookSortRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	
	public void run(String... args) throws Exception {
		//case#1 sort using single field
		
		//SQL: select * from  booktab order by bcost asc;
		/*Sort s1 = Sort.by("bookCost");
		Sort s1 = Sort.by(Direction.ASC,"bookCost");
		repo.findAll(s1).forEach(System.out::println);
		 */
		
		//SQL: select * from  booktab order by bcost desc;
	 	/*Sort s2 = Sort.by(Direction.DESC,"bookCost");
		repo.findAll(s2).forEach(System.out::println);
		*/
		
		//case#2 sort using multiple field
		//SQL: select * from  booktab order by bcost asc,bname asc;
		//Sort s3 = Sort.by("bookCost","bookName"); //ASC
		/*Sort s3 = Sort.by(Direction.ASC,"bookCost","bookName"); //ASC
		repo.findAll(s3).forEach(System.out::println);*/
		
		//SQL: select * from  booktab order by bcost desc,bname desc;
		/*Sort s4 = Sort.by(Direction.DESC,"bookCost","bookName"); //ASC
		repo.findAll(s4).forEach(System.out::println);
		*/
		
		//case#3 sort using multiple field with mixing types
		//SQL: select * from  booktab order by bcost asc, bname desc;
		/*Sort s5 = Sort.by(Order.asc("bookCost"),Order.desc("bookName"));
		repo.findAll(s5).forEach(System.out::println);*/
		
		//SQL: select * from  booktab order by bcost desc, bname asc;
		Sort s5 = Sort.by(Order.desc("bookCost"),Order.asc("bookName"));
		repo.findAll(s5).forEach(System.out::println);
	}
}
