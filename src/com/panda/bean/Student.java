package com.panda.bean;

import java.io.Serializable;

/*
* @author MrC
* @date 2016��11��10������9:38:30
* @parameter
* @version
*/
@SuppressWarnings("serial")
public class Student implements Serializable{
	//����
	private Long sid ;
	private String name ;
	private String description ;
	
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
