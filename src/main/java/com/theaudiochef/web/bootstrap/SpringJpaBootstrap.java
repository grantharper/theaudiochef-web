package com.theaudiochef.web.bootstrap;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.theaudiochef.web.domain.AccountType;
import com.theaudiochef.web.domain.AlexaLink;
import com.theaudiochef.web.domain.AmazonLogin;
import com.theaudiochef.web.domain.User;
import com.theaudiochef.web.repository.UserRepository;

@Component
@Profile("dev")
public class SpringJpaBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private Logger log = Logger.getLogger(SpringJpaBootstrap.class);

	@Autowired
	Environment env;
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (Arrays.asList(env.getActiveProfiles()).contains("dev")) {
			loadUsers();
			loadRoles();
			assignUsersToUserRole();
			assignUsersToAdminRole();
		}

	}

	private void assignUsersToAdminRole() {

	}

	private void assignUsersToUserRole() {

	}

	private void loadRoles() {


	}

	private void loadUsers() {
		log.info("loading dummy user data to dev environment");
		
		User user1 = new User();
		user1.setName("Grant Harper");
		user1.setAccountType(AccountType.BASIC);
		user1.setEmail("mail@theaudiochef.com");
		
		AmazonLogin login1 = new AmazonLogin(user1);
		login1.setAccessToken("AMZ-AT");
		login1.setRefreshToken("AMZ-RT");
		AlexaLink link1 = new AlexaLink(user1);
		link1.setAccessToken("AL-AT");
		link1.setRefreshToken("AL-RT");
		link1.setAuthorizationCode("AL-AC");
		
		userRepository.save(user1);
	}

}
