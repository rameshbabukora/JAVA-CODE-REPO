package in.nareshit.raghu.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import in.nareshit.raghu.entity.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, Integer>{

}
