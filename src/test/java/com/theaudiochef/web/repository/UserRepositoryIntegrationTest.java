package com.theaudiochef.web.repository;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.theaudiochef.web.domain.AlexaLink;
import com.theaudiochef.web.domain.AmazonLogin;
import com.theaudiochef.web.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryIntegrationTest {
	
	@Autowired
	UserRepository classUnderTest;
	
    @Autowired
    private AmazonLoginRepository loginRepo;
    
    @Autowired
    private AlexaLinkRepository linkRepo;
	
    
    private static final String ACCESS_TOKEN = "AT";
    private static final String AMZ_USER_ID ="AMZ-UID";
    private static final String NAME = "Grant";
    
    @Before
    public void setUp() {
        User user = new User();
        user.setName(NAME);
        classUnderTest.save(user);
    }
    
    @After
    public void tearDown() {
        classUnderTest.deleteAll();
    }
	
	@Test
	public void testInsert() {
		User user = new User();
		user.setName(NAME);
		classUnderTest.save(user);
		assertThat(user.getName(), is(equalTo(NAME)));
	}
	
	@Test
	public void testSaveUserWithAmazonLogin() {
	    AmazonLogin login = new AmazonLogin();
	    login.setAccessToken(ACCESS_TOKEN);
	    login.setAmazonUserId(AMZ_USER_ID);
	    User user = new User();
	    login.setUser(user);
	    user.setName(NAME);
	    user.setAmazonLogin(login);
	    //loginRepo.save(login);
	    classUnderTest.save(user);
	    
	    assertThat(classUnderTest.exists(user.getUserId()), equalTo(true));
	    assertThat(loginRepo.exists(user.getAmazonLogin().getUserId()), equalTo(true));
	}
	
	@Test
	public void testSaveUserWithAlexaLink() {
	    AlexaLink link = new AlexaLink();
	    link.setAccessToken(ACCESS_TOKEN);
	    
	    User user = new User();
	    link.setUser(user);
        user.setName(NAME);
        user.setAlexaLink(link);
        classUnderTest.save(user);
        
        assertThat(classUnderTest.exists(user.getUserId()), equalTo(true));
	    assertThat(linkRepo.exists(user.getAlexaLink().getUserId()), equalTo(true));
	}
	
	//this test currently throws an error because it says that the one to one mapping is using a null object

	@Test
	public void testRetrieveAndUpdateAlexaLink() {
	    User user = classUnderTest.findAll().get(0);
	    
	    assertThat(user, not(equalTo(null)));
	    
	    AlexaLink link = user.getAlexaLink();
	    if(link == null) link = new AlexaLink(user);
        link.setAccessToken(ACCESS_TOKEN);
        
        
        linkRepo.save(link);
        
        assertThat(classUnderTest.exists(user.getUserId()), equalTo(true));
        assertThat(linkRepo.exists(user.getAlexaLink().getUserId()), equalTo(true));
	    
	}

}
