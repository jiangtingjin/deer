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
@Table(name="bw_culture")
public class BwCulture {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long cId;
    private String cTitle;
    private Date pulishTime;
    private Date cCreateTime;
    private String cPhotosUrl;
    private String cContent;
    private Long cViews;
    private String cremark;
    public Long getcId() {
        return cId;
    }
    public void setcId(Long cId) {
        this.cId = cId;
    }
    public String getcTitle() {
        return cTitle;
    }
    public void setcTitle(String cTitle) {
        this.cTitle = cTitle;
    }
    public Date getPulishTime() {
        return pulishTime;
    }
    public void setPulishTime(Date pulishTime) {
        this.pulishTime = pulishTime;
    }
    public Date getcCreateTime() {
        return cCreateTime;
    }
    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }
    public String getcPhotosUrl() {
        return cPhotosUrl;
    }
    public void setcPhotosUrl(String cPhotosUrl) {
        this.cPhotosUrl = cPhotosUrl;
    }
    public String getcContent() {
        return cContent;
    }
    public void setcContent(String cContent) {
        this.cContent = cContent;
    }
    public Long getcViews() {
        return cViews;
    }
    public void setcViews(Long cViews) {
        this.cViews = cViews;
    }
    public String getCremark() {
        return cremark;
    }
    public void setCremark(String cremark) {
        this.cremark = cremark;
    }
   
    public String toString(){
        return org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(this);
    }
}
