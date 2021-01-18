package com.ssafy.a407.dto;

public class UserDto {
	private String email;
	private String password;
	private String nickname;
//	private String picture; //나중에 추가
	
	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	public UserDto(String email, String password, String nickname) {
		super();
		this.email = email;
		this.password = password;
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
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
	
	
	
	
}
