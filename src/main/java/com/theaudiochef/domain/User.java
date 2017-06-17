package com.theaudiochef.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class User extends AbstractDomainClass{
	
	private String name;
	
	private String email;
	
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	
	private String accessToken;
	
	private String authorizationCode;
	
	public User(){}
	
	
	

}
