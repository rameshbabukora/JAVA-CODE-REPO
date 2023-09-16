package in.nareshit.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.raghu.entity.Product;

public interface ProductRepository 
	extends JpaRepository<Product, Integer> 
{

	//case#1 select all columns
	//SQL: select * from prodtab
	//@Query("FROM Product P")
	@Query("SELECT P FROM Product P")
	List<Product> getAllProducts();

	//case#2 select one column
	//SQL: select pid from product
	@Query("SELECT P.prodId FROM Product P")
	List<Integer> getAllProductsIds();
	
	//case#3 select one column
	//SQL: select pid,pcode from product
	@Query("SELECT P.prodId,P.prodCode FROM Product P")
	List<Object[]> getAllProductsIdAndCode();

}
