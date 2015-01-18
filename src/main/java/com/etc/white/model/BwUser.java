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
@Table(name="bw_user")
public class BwUser {
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long uId;
    private String uPasssowrd;
    private Date uCreateTime;
    private Date finalLoginTime;
    private String uEmail;
    private String uPhone;
    private String uIdentity;
    private String uSex;
    private String uremark;
    public Long getuId() {
        return uId;
    }
    public void setuId(Long uId) {
        this.uId = uId;
    }
    public String getuPasssowrd() {
        return uPasssowrd;
    }
    public void setuPasssowrd(String uPasssowrd) {
        this.uPasssowrd = uPasssowrd;
    }
    public Date getuCreateTime() {
        return uCreateTime;
    }
    public void setuCreateTime(Date uCreateTime) {
        this.uCreateTime = uCreateTime;
    }
    public Date getFinalLoginTime() {
        return finalLoginTime;
    }
    public void setFinalLoginTime(Date finalLoginTime) {
        this.finalLoginTime = finalLoginTime;
    }
    public String getuEmail() {
        return uEmail;
    }
    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }
    public String getuPhone() {
        return uPhone;
    }
    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }
    public String getuIdentity() {
        return uIdentity;
    }
    public void setuIdentity(String uIdentity) {
        this.uIdentity = uIdentity;
    }
    public String getuSex() {
        return uSex;
    }
    public void setuSex(String uSex) {
        this.uSex = uSex;
    }
    public String getUremark() {
        return uremark;
    }
    public void setUremark(String uremark) {
        this.uremark = uremark;
    }
    
    public String toString(){
        return org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(this);
    }  
    
    

}
