package com.cg.usrsrvc.dto;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
public class AuthResponse {
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public AuthResponse(int userId, String username, String email, String token) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.token = token;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	private int userId;

	private String username;

	private String email;
	
	private String token;

}