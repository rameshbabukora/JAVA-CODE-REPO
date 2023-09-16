package in.nareshit.raghu.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
		.dataSource(dataSource)
		.usersByUsernameQuery("SELECT uname, upwd, uenable FROM user_tab WHERE uname=?")
		.authoritiesByUsernameQuery("SELECT uname, urole FROM user_tab WHERE uname=?")
		.passwordEncoder(passwordEncoder)
		;
	}
	
	
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		// Access level
		.antMatchers("/welcome").permitAll()
		.antMatchers("/emp").hasAuthority("EMPLOYEE")
		.antMatchers("/adm").hasAuthority("ADMIN")
		.antMatchers("/std").hasAuthority("STUDENT")
		
		.anyRequest().authenticated()
		
		//Form Details
		.and()
		.formLogin()
		.defaultSuccessUrl("/home", true)
		
		//logout
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/signout"))
		
		//exception handling
		.and()
		.exceptionHandling()
		.accessDeniedPage("/denied")
		;
	}
}
