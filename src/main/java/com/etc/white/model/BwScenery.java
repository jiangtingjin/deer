package com.etc.white.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="bw_scenery")
public class BwScenery {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long sId;
	private String sTitle;
	private String sDescription;
	private Date pulishTime;
	private String sreamrk;
	public Long getsId() {
		return sId;
	}
	public void setsId(Long sId) {
		this.sId = sId;
	}
	public String getsTitle() {
		return sTitle;
	}
	public void setsTitle(String sTitle) {
		this.sTitle = sTitle;
	}
	public String getsDescription() {
		return sDescription;
	}
	public void setsDescription(String sDescription) {
		this.sDescription = sDescription;
	}
	public Date getPulishTime() {
		return pulishTime;
	}
	public void setPulishTime(Date pulishTime) {
		this.pulishTime = pulishTime;
	}
	public String getSreamrk() {
		return sreamrk;
	}
	public void setSreamrk(String sreamrk) {
		this.sreamrk = sreamrk;
	}
	
	public String toString(){
        return org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(this);
    }
}
