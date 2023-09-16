package in.nareshit.raghu.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.Product;
import in.nareshit.raghu.repo.ProductRepository;

//@Component
public class ProductDataInsertRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		Date dte = new Date();
		
		Product product = new Product();
		product.setPid(100);
		product.setPname("SAMPLE");
		
		product.setCreatedDate(dte);
		product.setExpDate(dte);
		product.setPackingTime(dte);
		
		repo.save(product);
	}

}
