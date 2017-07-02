package com.theaudiochef.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.theaudiochef.web.domain.User;

@Controller
public class TestController {

	
	@RequestMapping(value = "/rest", method=RequestMethod.GET)
	public @ResponseBody User serializeUser(){
		User user = new User();
		user.setName("Grant");
		user.setEmail("grant@grant.com");
		return user;
	}
	
}
