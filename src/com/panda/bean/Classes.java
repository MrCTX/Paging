package com.panda.bean;
/*
* @author MrC
* @date 2016年11月10日上午9:39:35
* @parameter
* @version
*/

import java.io.Serializable;
import java.util.Set;

@SuppressWarnings("serial")
public class Classes implements Serializable {
	//主键
	private Long cid ;
	private String name ;
	private String description ;
	//班级可以确定学生，但是学生不能确定班级
	private Set<Student> student ;

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
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

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	
}
