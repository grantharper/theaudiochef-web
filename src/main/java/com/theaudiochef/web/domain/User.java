package com.theaudiochef.web.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class User extends AbstractDomainClass {

	private String name;

	private String email;

	@Enumerated(EnumType.STRING)
	private AccountType accountType;

	private String accessToken;

	private String authorizationCode;

	private String amazonUserId;
	private String amazonAccessToken;
	private String amazonRefreshToken;
	private Integer amazonExpiresIn;
	private String amazonTokenType;

	public User() {
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the accountType
	 */
	public AccountType getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * @return the authorizationCode
	 */
	public String getAuthorizationCode() {
		return authorizationCode;
	}

	/**
	 * @param authorizationCode the authorizationCode to set
	 */
	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	/**
	 * @return the amazonUserId
	 */
	public String getAmazonUserId() {
		return amazonUserId;
	}

	/**
	 * @param amazonUserId the amazonUserId to set
	 */
	public void setAmazonUserId(String amazonUserId) {
		this.amazonUserId = amazonUserId;
	}

	/**
	 * @return the amazonAccessToken
	 */
	public String getAmazonAccessToken() {
		return amazonAccessToken;
	}

	/**
	 * @param amazonAccessToken the amazonAccessToken to set
	 */
	public void setAmazonAccessToken(String amazonAccessToken) {
		this.amazonAccessToken = amazonAccessToken;
	}

	/**
	 * @return the amazonRefreshToken
	 */
	public String getAmazonRefreshToken() {
		return amazonRefreshToken;
	}

	/**
	 * @param amazonRefreshToken the amazonRefreshToken to set
	 */
	public void setAmazonRefreshToken(String amazonRefreshToken) {
		this.amazonRefreshToken = amazonRefreshToken;
	}

	/**
	 * @return the amazonExpiresIn
	 */
	public Integer getAmazonExpiresIn() {
		return amazonExpiresIn;
	}

	/**
	 * @param amazonExpiresIn the amazonExpiresIn to set
	 */
	public void setAmazonExpiresIn(Integer amazonExpiresIn) {
		this.amazonExpiresIn = amazonExpiresIn;
	}

	/**
	 * @return the amazonTokenType
	 */
	public String getAmazonTokenType() {
		return amazonTokenType;
	}

	/**
	 * @param amazonTokenType the amazonTokenType to set
	 */
	public void setAmazonTokenType(String amazonTokenType) {
		this.amazonTokenType = amazonTokenType;
	}
	
	
	

}
