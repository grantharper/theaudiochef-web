package com.theaudiochef.web.bootstrap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.theaudiochef.web.domain.User;
import com.theaudiochef.web.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJpaBootstrapTest {

	@Autowired
	UserRepository userRepository;
	
	@Ignore
	@Test
	public void userLoads() {
		List<User> users = userRepository.findAll();
		assertThat(users.size(), is(equalTo(1)));
	}


}
