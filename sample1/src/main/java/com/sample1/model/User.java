package com.sample1.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "first_name")
	private String fname;
	@Column(name = "last_name")
	private String lname;
	@Column(name = "address")
	private String address;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "owner_id", referencedColumnName = "id")
	private List<Phone> phones;

	public void addPhones(List<Phone> phones) {
		if (this.phones == null)
			this.phones = phones;
		else
			this.phones.addAll(phones);
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	/* POJO */
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

	/* pojo continues */
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

	public void setId(Long id) {
		this.id = id;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
