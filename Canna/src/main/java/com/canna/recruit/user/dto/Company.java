package com.canna.recruit.user.dto;

import org.joda.time.DateTime;

public class Company {
	private String id;
	private String password;
	private String userName;
	private String nickName;
	private String email;
	private String tel;
	private Authority authority;
	private DateTime joinDate;
	private String companyName;
	private String address;
	
	public String getCustomFormatTime() {
		return joinDate.toString("yyyy-MM-dd HH:mm:ss");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Authority getAuthority() {
		return authority;
	}
	public void setAuthority(Authority authority) {
		this.authority = authority;
	}
	public DateTime getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(DateTime joinDate) {
		this.joinDate = joinDate;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
