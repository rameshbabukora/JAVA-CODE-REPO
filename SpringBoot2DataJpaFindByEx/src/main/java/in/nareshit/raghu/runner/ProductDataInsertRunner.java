package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import in.nareshit.raghu.entity.Product;
import in.nareshit.raghu.repo.ProductRepository;

//@Component
public class ProductDataInsertRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		repo.save(new Product(101, "PEN", 200.0, "MNO"));
		repo.save(new Product(102, "BOOK", 600.0, "XYZ"));
		repo.save(new Product(103, "TAB", 1200.0, "MNO"));
		repo.save(new Product(104, "MOUSE", 500.0, "XYZ"));
		repo.save(new Product(105, "BTL", 300.0, "MNO"));
		repo.save(new Product(106, "CAP", 100.0, null));
	}

}
