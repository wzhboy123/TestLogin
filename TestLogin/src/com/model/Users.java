package com.model;

public class Users {
	private String id;  //编号
	private String username;//用户名
	private String password;//密码
	
	public Users(String id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public Users() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
