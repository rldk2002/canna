package com.canna.recruit.user.domain;

public class Personal extends User {
	private String birthday;
	private Gender gender;
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
