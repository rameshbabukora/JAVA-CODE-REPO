package in.nareshit.raghu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//InMemory/Jdbc/UserDetailsService
		auth.inMemoryAuthentication().withUser("sam").password("{noop}sam").authorities("ADMIN");
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/all","/login").permitAll()
		.anyRequest().authenticated()
		.and().formLogin()
		.and().oauth2Login()
		.and().csrf().disable() //must be disabled
		;
		
	}
}
