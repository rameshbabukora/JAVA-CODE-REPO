package in.nareshit.raghu.service;

import java.util.Optional;

import in.nareshit.raghu.entity.User;

public interface IUserService {

	Integer saveUser(User user);
	Optional<User> findUserByEmail(String email);
}
