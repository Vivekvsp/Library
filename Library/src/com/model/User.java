package com.model;

public class User {
	private int userId;
	private String userName;
	private String userPhone;
	private String userCity;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public User(int userId, String userName, String userPhone, String userCity) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userCity = userCity;
	}
	public User(String userName, String userPhone, String userCity) {
		super();
		this.userName = userName;
		this.userPhone = userPhone;
		this.userCity = userCity;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPhone=" + userPhone + ", userCity="
				+ userCity + "]";
	}
	
		
}
