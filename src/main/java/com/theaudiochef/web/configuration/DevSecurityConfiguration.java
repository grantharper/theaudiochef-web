package com.theaudiochef.web.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Profile("dev")
public class DevSecurityConfiguration extends WebSecurityConfigurerAdapter {

	public static Logger log = LoggerFactory.getLogger(DevSecurityConfiguration.class);

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {

		log.info("Dev Security configuration is active");
		httpSecurity.authorizeRequests().antMatchers("/**", "/console/**").permitAll().anyRequest().authenticated()
				.and().formLogin().loginPage("/login").permitAll().and().logout().permitAll();

		httpSecurity.csrf().disable();
		httpSecurity.headers().frameOptions().disable();

	}

}
