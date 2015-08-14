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

	@OneToMany(mappedBy = "owner")
	private List<Phone> phones;

	/*POJO*/
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

	/*Additional*/
	public void addPhone(Phone phone) {
        this.phones.add(phone);
        if (phone.getOwner() != this) {
            phone.setOwner(this);
        }
    }
	/*pojo continues */
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

	public List<Phone> getPhones() {
		return phones;
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
	
	
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
}
