package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.ProductRepository;

@Component
public class ProductQueryTestRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		//repo.getAllProducts().forEach(System.out::println);
		//repo.getAllProductsIds().forEach(System.out::println);
		repo.getAllProductsIdAndCode()
		.stream()
		.map(ob->ob[0]+"-"+ob[1])
		.forEach(System.out::println);
	}

}
