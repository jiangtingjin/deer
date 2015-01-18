package com.etc.white.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author tjjiang
 *
 */
@Entity
@Table(name="bw_Life")
public class BwLife {
	 @Id
	 @GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long lId;
	private String lname;
	private Date lCreateTime;
	private String lPhotosUrl;
	private String lContent;
	private Long lViews;
	private String lremark;
	public Long getlId() {
		return lId;
	}
	public void setlId(Long lId) {
		this.lId = lId;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getlCreateTime() {
		return lCreateTime;
	}
	public void setlCreateTime(Date lCreateTime) {
		this.lCreateTime = lCreateTime;
	}
	public String getlPhotosUrl() {
		return lPhotosUrl;
	}
	public void setlPhotosUrl(String lPhotosUrl) {
		this.lPhotosUrl = lPhotosUrl;
	}
	public String getlContent() {
		return lContent;
	}
	public void setlContent(String lContent) {
		this.lContent = lContent;
	}
	public Long getlViews() {
		return lViews;
	}
	public void setlViews(Long lViews) {
		this.lViews = lViews;
	}
	public String getLremark() {
		return lremark;
	}
	public void setLremark(String lremark) {
		this.lremark = lremark;
	}
	public String toString(){
        return org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(this);
    }

}
