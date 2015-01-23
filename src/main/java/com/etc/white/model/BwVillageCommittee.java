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
@Table(name="bw_villagecommittee")
public class BwVillageCommittee {
	@Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long vcId;
	/**
	 * 1->村委会党建
	 * 2->学习宣传
	 * 3->劳动保障
	 * 4->民政低保
	 * 5->计划生育
	 * 6->莘野特色产业
	 * 7->就业服务
	 */
	private int vcTitle;
	private String vcHead;
	private String vcContent;
	private Date vcCreateTime;
	private String vcAuthor;
	private String vcRemark;
	public Long getVcId() {
		return vcId;
	}
	public void setVcId(Long vcId) {
		this.vcId = vcId;
	}
	public int getVcTitle() {
		return vcTitle;
	}
	public void setVcTitle(int vcTitle) {
		this.vcTitle = vcTitle;
	}
	public String getVcContent() {
		return vcContent;
	}
	public void setVcContent(String vcContent) {
		this.vcContent = vcContent;
	}
	public Date getVcCreateTime() {
		return vcCreateTime;
	}
	public void setVcCreateTime(Date vcCreateTime) {
		this.vcCreateTime = vcCreateTime;
	}
	public String getVcAuthor() {
		return vcAuthor;
	}
	public void setVcAuthor(String vcAuthor) {
		this.vcAuthor = vcAuthor;
	}
	public String getVcRemark() {
		return vcRemark;
	}
	public void setVcRemark(String vcRemark) {
		this.vcRemark = vcRemark;
	}
	
	public String getVcHead() {
        return vcHead;
    }
    public void setVcHead(String vcHead) {
        this.vcHead = vcHead;
    }
    public String toString(){
        return org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(this);
    } 
}
