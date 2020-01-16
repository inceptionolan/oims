package com.app.pojos;

import javax.persistence.*;

@Entity
public class User {
    
	private Integer userId;
	private String email;
	
	public User() {
		System.out.println("in user class");
	}

	public User(Integer userId, String email) {
		super();
		this.userId = userId;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + "]";
	}
}
