package com.sample1.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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

	
	@JsonManagedReference
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "owner_id", referencedColumnName = "id")
	private List<Phone> phones;

	
	@JsonManagedReference
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(	name = "user_car", 
				joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id") ,
				inverseJoinColumns = @JoinColumn(name = "car_id", referencedColumnName = "id") )
	private List<Car> carList;

	
	public List<Car> getCars() {
		return carList;
	}

	public void setCars(List<Car> carList) {
		this.carList = carList;
	}

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
