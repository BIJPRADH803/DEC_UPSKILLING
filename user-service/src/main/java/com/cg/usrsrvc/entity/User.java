package com.cg.usrsrvc.entity;


//import jakarta.persistence.*;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder

@Entity
@Table(name = "user_table")
public class User {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	private String username;

	private String password;

	private String email;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ "]";
	}
	

}