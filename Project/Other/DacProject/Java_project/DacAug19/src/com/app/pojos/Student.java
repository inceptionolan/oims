package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Student {
	private Integer studentId;
	private String fName;
	private String lName;
	private String role;
	private String email;
	private Integer mobile;
	private String password;
	
	public Student() {
		System.out.println("In student pojo");
	}

	public Student(Integer studentId, String fName, String email, String lName, String role, Integer mobile, String password) {
		super();
		this.studentId = studentId;
		this.fName = fName;
		this.lName = lName;
		this.role = role;
		this.mobile = mobile;
		this.password = password;
		this.email= email;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getStudentId() {
		return studentId;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getRole() {
		return role;
	}

	public Integer getMobile() {
		return mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fName=" + fName + ", lName=" + lName + ", role=" + role
				+ ", email=" + email + ", mobile=" + mobile + "]";
	}

	
	
	
}
