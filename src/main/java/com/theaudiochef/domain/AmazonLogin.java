package com.theaudiochef.domain;

import javax.persistence.Entity;

@Entity
public class AmazonLogin extends AbstractDomainClass{

	private String amazonUserId;
	private String accessToken;
	private String refreshToken;
	private Integer expiresIn;
	private String tokenType;
	
	
}
