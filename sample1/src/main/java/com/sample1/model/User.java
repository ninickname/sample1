package com.sample1.model;


import javax.persistence.*;

@Entity
public class User {
	
	@Id
	private String id;
	private String fname;
	private String lname;
	private String address;
	
	public User() {
		super();
	}
	public User(String id, String fname, String lname, String address) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public String getFname() {
		return fname;
	}
	public String getId() {
		return id;
	}
	public String getLname() {
		return lname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}	
}
