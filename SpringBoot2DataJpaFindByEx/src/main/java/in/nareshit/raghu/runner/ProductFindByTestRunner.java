package in.nareshit.raghu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.ProductRepository;

@Component
public class ProductFindByTestRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	public void run(String... args) throws Exception {
		repo.findByProdVen("MNO").forEach(System.out::println);
		//repo.findByProdVenIs("MNO").forEach(System.out::println);
		//repo.findByProdVenEquals("MNO").forEach(System.out::println);
		//repo.findByProdCostLessThan(800.0).forEach(System.out::println);
		//repo.findByProdIdGreaterThanEqual(103).forEach(System.out::println);
		//repo.findByProdIdNot(103).forEach(System.out::println);
		//repo.findByProdIdIn(Arrays.asList(101,115,103,106)).forEach(System.out::println);
		//repo.findByProdIdNotIn(Arrays.asList(101,115,103,106)).forEach(System.out::println);
		//repo.findByProdVenIsNull().forEach(System.out::println);
		//repo.findByProdVenIsNotNull().forEach(System.out::println);

		//repo.findByProdCodeLike("___").forEach(System.out::println);
		//repo.findByProdCodeLike("B%").forEach(System.out::println);
		//repo.findByProdCodeStartingWith("B").forEach(System.out::println);

		//repo.findByProdCodeLike("%E").forEach(System.out::println);
		//repo.findByProdCodeEndingWith("E").forEach(System.out::println);


		//repo.findByProdCodeLike("%A%").forEach(System.out::println);
		//repo.findByProdCodeContaining("A").forEach(System.out::println);

		/*Optional<Product> opt = repo.findByProdIdAndProdCode(101,"PEN");
		if(opt.isPresent()) 
			System.out.println(opt.get());
		else
			System.out.println("no Data");*/
		
		//repo.findByProdIdOrProdCode(101,"BOOK").forEach(System.out::println);
		//repo.findByProdIdBetween(101,104).forEach(System.out::println);
		//repo.findByProdVenOrderByProdCode("MNO").forEach(System.out::println);
		//repo.findByProdVenOrderByProdCodeDesc("MNO").forEach(System.out::println);
	}

}
