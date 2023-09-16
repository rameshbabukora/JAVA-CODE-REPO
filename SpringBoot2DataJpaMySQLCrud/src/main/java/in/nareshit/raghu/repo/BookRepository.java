package in.nareshit.raghu.repo;

import org.springframework.data.repository.CrudRepository;

import in.nareshit.raghu.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
