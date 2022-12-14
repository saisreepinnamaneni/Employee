package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")


public class Employee {
	@Id
	@Column(name ="id")
	private int id;
	
	@Column(name ="name")
	private String name;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Column(name = "age")
	private int age;
	
	//@Column(name="gender")
	//private String gender;
	
	@Column(name = "dept")
	private String dept;
	

	}
	
	
	
	
	
	
	
	

	

