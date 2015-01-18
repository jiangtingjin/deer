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
@Table(name="bw_news")
public class BwNews {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long nId;
    private Date nCreateTime;
    private Date nPulishTime;
    private String nTitle;
    private String nContent;
    private String nAuthor;
    private String nType;
    private Long uViews;
    private String nSource;
    private String nremark;
    public Long getnId() {
        return nId;
    }
    public void setnId(Long nId) {
        this.nId = nId;
    }
    public Date getnCreateTime() {
        return nCreateTime;
    }
    public void setnCreateTime(Date nCreateTime) {
        this.nCreateTime = nCreateTime;
    }
    public Date getnPulishTime() {
        return nPulishTime;
    }
    public void setnPulishTime(Date nPulishTime) {
        this.nPulishTime = nPulishTime;
    }
    public String getnTitle() {
        return nTitle;
    }
    public void setnTitle(String nTitle) {
        this.nTitle = nTitle;
    }
    public String getnContent() {
        return nContent;
    }
    public void setnContent(String nContent) {
        this.nContent = nContent;
    }
    public String getnAuthor() {
        return nAuthor;
    }
    public void setnAuthor(String nAuthor) {
        this.nAuthor = nAuthor;
    }
    public String getnType() {
        return nType;
    }
    public void setnType(String nType) {
        this.nType = nType;
    }
    public Long getuViews() {
        return uViews;
    }
    public void setuViews(Long uViews) {
        this.uViews = uViews;
    }
    public String getnSource() {
        return nSource;
    }
    public void setnSource(String nSource) {
        this.nSource = nSource;
    }
    public String getNremark() {
        return nremark;
    }
    public void setNremark(String nremark) {
        this.nremark = nremark;
    }
    public String toString(){
        return org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(this);
    }  
    

}
