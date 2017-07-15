package com.theaudiochef.web.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User extends AbstractDomainClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;

    private String name;

    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_type")
    private AccountType accountType;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private AmazonLogin amazonLogin;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private AlexaLink alexaLink;

    public User() {
    }

    /**
     * @return the userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     *            the userId to set
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
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
     * @param email
     *            the email to set
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
     * @param accountType
     *            the accountType to set
     */
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * @return the amazonLogin
     */
    public AmazonLogin getAmazonLogin() {
        return amazonLogin;
    }

    /**
     * @param amazonLogin
     *            the amazonLogin to set
     */
    public void setAmazonLogin(AmazonLogin amazonLogin) {
        this.amazonLogin = amazonLogin;
    }

    /**
     * @return the alexaLink
     */
    public AlexaLink getAlexaLink() {
        return alexaLink;
    }

    /**
     * @param alexaLink
     *            the alexaLink to set
     */
    public void setAlexaLink(AlexaLink alexaLink) {
        this.alexaLink = alexaLink;
    }

}
