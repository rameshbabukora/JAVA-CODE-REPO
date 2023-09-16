package in.nareshit.raghu.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.entity.Product;

public interface ProductRepository 
	extends JpaRepository<Product, Integer> 
{

	/**
	 * using = equals operator with WHERE condition
	 */
	//SQL: select * from prodtab where pven=?
	List<Product> findByProdVen(String prodVen);
	List<Product> findByProdVenIs(String prodVen);
	List<Product> findByProdVenEquals(String prodVen);
	
	/**
	 * using >, >=, < , <=, != operator with WHERE condition
	 */
	List<Product> findByProdCostLessThan(Double prodCost);
	List<Product> findByProdIdGreaterThanEqual(Integer prodId);
	List<Product> findByProdIdNot(Integer prodId);
	
	/**
	 * in, no in operator
	 */
	List<Product> findByProdIdIn(List<Integer> ids);
	List<Product> findByProdIdNotIn(List<Integer> ids);

	/**
	 * Null, not null condition
	 */
	//SQL: SELECT * FROM PROD WHERE PVEN IS NULL
	List<Product> findByProdVenIsNull();
	List<Product> findByProdVenIsNotNull();
	
	/***
	 * like and not like
	 */
	List<Product> findByProdCodeLike(String pattern);
	List<Product> findByProdCodeStartingWith(String pattern);
	List<Product> findByProdCodeEndingWith(String pattern);
	List<Product> findByProdCodeContaining(String pattern);
	
	/**
	 * and, or
	 */
	//SQL: select * from prodtab where pid=? or pcode=?
	List<Product> findByProdIdOrProdCode(Integer pid,String pcode);
	Optional<Product> findByProdIdAndProdCode(Integer pid,String pcode);

	/***
	 * between
	 */
	List<Product> findByProdIdBetween(Integer from,Integer to);
	
	/**
	 * Sorted data
	 */
	//SQL: select * from prodtab where pven=? order by prodcode ASC
	List<Product> findByProdVenOrderByProdCode(String prodVen);
	List<Product> findByProdVenOrderByProdCodeDesc(String prodVen);
}
