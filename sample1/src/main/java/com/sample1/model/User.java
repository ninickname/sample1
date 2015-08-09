package com.sample1.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User{
	
	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "first_name")
	private String fname;
	@Column(name = "last_name")
	private String lname;
	@Column(name = "address")
	private String address;

	public User() {
		super();
	}

	public User(long id, String fname, String lname, String address) {
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

	public long getId() {
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

	public void setId(long id) {
		this.id = id;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
}
