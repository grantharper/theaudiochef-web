package com.theaudiochef.web.domain;


import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;

@MappedSuperclass
public abstract class AbstractDomainClass {
	
	@Version
	private Long version;
	
	@Column(name="create_ts")
	private Timestamp createTs;
	
	@Column(name="update_ts")
	private Timestamp updateTs;
	



    /**
     * @return the version
     */
    public Long getVersion() {
        return version;
    }




    /**
     * @param version the version to set
     */
    public void setVersion(Long version) {
        this.version = version;
    }




    /**
     * @return the createTs
     */
    public Timestamp getCreateTs() {
        return createTs;
    }




    /**
     * @param createTs the createTs to set
     */
    public void setCreateTs(Timestamp createTs) {
        this.createTs = createTs;
    }




    /**
     * @return the updateTs
     */
    public Timestamp getUpdateTs() {
        return updateTs;
    }




    /**
     * @param updateTs the updateTs to set
     */
    public void setUpdateTs(Timestamp updateTs) {
        this.updateTs = updateTs;
    }




    @PreUpdate
	@PrePersist
	public void updateTimeStamps() {
		this.updateTs = Timestamp.valueOf(LocalDateTime.now());
		if(this.createTs == null){
			this.createTs = Timestamp.valueOf(LocalDateTime.now());
		}
	}

}
