package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.entity.Address;

public interface AddressRepository 
	extends JpaRepository<Address, Integer> {

}
