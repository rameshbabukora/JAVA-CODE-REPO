package in.nareshit.raghu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService)
		.passwordEncoder(passwordEncoder);
	}
	
	
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/user/register","/user/save","/user/login","/welcome","/login").permitAll()
		.antMatchers("/emp").hasAuthority("EMPLOYEE")
		.antMatchers("/adm").hasAuthority("ADMIN")
		.antMatchers("/std").hasAnyAuthority("ADMIN","EMPLOYEE")
		.anyRequest().authenticated()
		
		.and()
		.formLogin()
		.loginPage("/user/login") //GET -- to Show Login page
		.loginProcessingUrl("/login") //POST -- ToDo Login Check
		.defaultSuccessUrl("/home",true) // On Login success
		.failureUrl("/user/login?error=true")//Login Failed
		
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/signout"))//URL -ToDo Logout
		.logoutSuccessUrl("/user/login?logout=true") //On Logout success
		
		.and()
		.exceptionHandling()
		.accessDeniedPage("/denied") // On Invalid Role Access
		;
	}
}
