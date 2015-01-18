package com.etc.white.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author Administrator
 */
@Entity
@Table(name="bw_introduction")
public class BwIntroduction {
	@Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long inId;
	/**
	 * 1->白鹿村简介
	 * 2->村委会简介
	 * 3->村干部简介
	 */
	private int intype;
	private String inContent;
	private String inUrl;
	private String inAuthor;
	private Date inPulishTime;
	private String inRemark;
	public Long getInId() {
		return inId;
	}
	public void setInId(Long inId) {
		this.inId = inId;
	}
	public int getIntype() {
		return intype;
	}
	public void setIntype(int intype) {
		this.intype = intype;
	}
	public String getInContent() {
		return inContent;
	}
	public void setInContent(String inContent) {
		this.inContent = inContent;
	}
	public String getInUrl() {
		return inUrl;
	}
	public void setInUrl(String inUrl) {
		this.inUrl = inUrl;
	}
	public String getInAuthor() {
		return inAuthor;
	}
	public void setInAuthor(String inAuthor) {
		this.inAuthor = inAuthor;
	}
	public Date getInPulishTime() {
		return inPulishTime;
	}
	public void setInPulishTime(Date inPulishTime) {
		this.inPulishTime = inPulishTime;
	}
	public String getInRemark() {
		return inRemark;
	}
	public void setInRemark(String inRemark) {
		this.inRemark = inRemark;
	}
	public String toString(){
        return org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(this);
} 
	
	
	
	

}
