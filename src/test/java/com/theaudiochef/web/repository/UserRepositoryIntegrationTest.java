package com.theaudiochef.web.repository;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.theaudiochef.web.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryIntegrationTest {
	
	@Autowired
	UserRepository userRepository;
	
	@Test
	public void testInsert() {
		User user = new User();
		user.setName("John");
		userRepository.save(user);
		assertThat(user.getId(), is(equalTo(1L)));
	}

}
