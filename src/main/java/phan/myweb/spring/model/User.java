package phan.myweb.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "tbl_user")
public class User {
	
	@Column(name = "ID")
	@Type(type = "String")
	private String ID;
	
	@Column(name = "username")
	@Type(type = "String")
	private String username;
	
	@Column(name = "password")
	@Type(type = "String")
	private String password;
	
	@Column(name = "address")
	@Type(type = "String")
	private String address;

	
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
