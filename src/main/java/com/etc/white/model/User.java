package com.etc.white.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户实体
 * @author 蒋廷金
 */

@Entity
@Table(name="wb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer age;	
	private String gender;
	private String birthday;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String toString(){
		return org.apache.commons.lang.builder.ReflectionToStringBuilder.toString(this);
	} 

}
