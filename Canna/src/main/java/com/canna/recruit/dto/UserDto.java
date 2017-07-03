/**
 * 
 *	회원 정보 모델
 *
 */
package com.canna.recruit.dto;

import org.joda.time.DateTime;

public class UserDto {
	private String id;
	private String password;
	private String nickname;
	private String email;
	private DateTime joindate;
	
	public String getCustomFormatTime() {
		return joindate.toString("yyyy-MM-dd HH:mm:ss");
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public DateTime getJoindate() {
		return joindate;
	}
	public void setJoindate(DateTime joindate) {
		this.joindate = joindate;
	}
	
}
