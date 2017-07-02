package com.theaudiochef.web.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Profile("dev")
public class DevLoginController {

	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getDevLogin(Model model){
		return "dev-login";
	}
	
}
