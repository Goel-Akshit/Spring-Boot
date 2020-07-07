package in.akshit.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	//to create in memory authorized users 
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("admin")
			.password("password")
			.roles("ADMIN");
	}
	
	//this is a requirement by spring boot for encoding and decoding password type in form so can't skip
	@SuppressWarnings("deprecation")
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	//this is used to authenticate correct user/admin for the correct url
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable()
			.authorizeRequests()
			.antMatchers("/admin").access("hasRole('ADMIN')") //access vs hasRole functionality diffent very much
			.antMatchers("/").permitAll()
			.and().formLogin();		
	}

}
