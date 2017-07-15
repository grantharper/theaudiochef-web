package com.theaudiochef.web.domain;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Table(name = "amazon_login")
@Entity
public class AmazonLogin extends AbstractDomainClass {

    @Id
    @GeneratedValue(generator = "myGenerator")
    @GenericGenerator(name = "myGenerator", strategy = "foreign", parameters = @Parameter(value = "user", name = "property"))
    private Long userId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "amazon_user_id")
    private String amazonUserId;

    @Column(name = "access_token")
    private String accessToken;

    @Column(name = "refresh_token")
    private String refreshToken;

    @Column(name = "expire_ts")
    private LocalDateTime expireTs;

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
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user
     *            the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the amazonUserId
     */
    public String getAmazonUserId() {
        return amazonUserId;
    }

    /**
     * @param amazonUserId
     *            the amazonUserId to set
     */
    public void setAmazonUserId(String amazonUserId) {
        this.amazonUserId = amazonUserId;
    }

    /**
     * @return the accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * @param accessToken
     *            the accessToken to set
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * @return the refreshToken
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * @param refreshToken
     *            the refreshToken to set
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * @return the expireTs
     */
    public LocalDateTime getExpireTs() {
        return expireTs;
    }

    /**
     * @param expireTs
     *            the expireTs to set
     */
    public void setExpireTs(LocalDateTime expireTs) {
        this.expireTs = expireTs;
    }

}
