package com.capgemini.fms.dto;

public class User {

	String usertype;
	long userId;
	String userName;
	String userPassword;
	long userPhone;
	String userEmail;

	public User(String usertype, long userId, String userName, String userPassword, long userPhone, String userEmail) {
		super();
		this.usertype = usertype;
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "User [usertype=" + usertype + ", userId=" + userId + ", userName=" + userName + ", userPassword="
				+ userPassword + ", userPhone=" + userPhone + ", userEmail=" + userEmail + "]";
	}

}
