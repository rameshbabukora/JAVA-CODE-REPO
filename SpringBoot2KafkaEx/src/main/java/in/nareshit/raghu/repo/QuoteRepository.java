package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.entity.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Integer> {

}
