package com.etc.white.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Administrator
 *
 */

@Entity
@Table(name="bw_forum")
public class BwForum {
	@Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long nId;
	private Long fId;
	private Long fUid;
	private String fcontent;
	private Date createTime;
	private String freamrk;
	public Long getfId() {
		return fId;
	}
	public void setfId(Long fId) {
		this.fId = fId;
	}
	public Long getfUid() {
		return fUid;
	}
	public void setfUid(Long fUid) {
		this.fUid = fUid;
	}
	public String getFcontent() {
		return fcontent;
	}
	public void setFcontent(String fcontent) {
		this.fcontent = fcontent;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getFreamrk() {
		return freamrk;
	}
	public void setFreamrk(String freamrk) {
		this.freamrk = freamrk;
	}
    public String toString(){
	        return org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(this);
    }  
}
