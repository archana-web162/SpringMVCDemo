package com.example.demo.model;

import java.util.Date;

public class User {
	private Integer userId;
	private String userName;
	private Integer userContact;
	private String userEmail;
	private String userAddress;

	public User(Integer userId, String userName, Integer userContact, String userEmail, String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userContact = userContact;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserContact() {
		return userContact;
	}

	public void setUserContact(Integer userContact) {
		this.userContact = userContact;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

}
