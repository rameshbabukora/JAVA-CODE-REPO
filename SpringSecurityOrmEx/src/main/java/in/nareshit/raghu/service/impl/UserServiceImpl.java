package in.nareshit.raghu.service.impl;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.entity.User;
import in.nareshit.raghu.repo.UserRepository;
import in.nareshit.raghu.service.IUserService;

@Service
public class UserServiceImpl implements IUserService, UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public Integer saveUser(User user) {
		//read Form Password, encode it
		String encPwd = passwordEncoder.encode(user.getPwd());
		//set back to same object
		user.setPwd(encPwd);
		
		return repo.save(user).getId();
	}

	public Optional<User> findUserByEmail(String email) {
		return repo.findByEmail(email);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
	
		//make Database call using username
		Optional<User> opt = findUserByEmail(username);
		
		if(!opt.isPresent()) { //if user not exist
			throw new UsernameNotFoundException("User not found");
		} else { //if user is present
			User user = opt.get();
			//User Roles
			Set<String> roles = user.getRoles();
			
			Set<GrantedAuthority> authorities = new HashSet<>();
			for(String role:roles) {
				authorities.add(new SimpleGrantedAuthority(role));
			}
			//spring Security user object
			return new org.springframework.security.core.userdetails.User(
					user.getEmail(), 
					user.getPwd(), 
					authorities
					);
		}
		
	}

}
