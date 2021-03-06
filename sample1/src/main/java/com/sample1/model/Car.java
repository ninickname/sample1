package com.sample1.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {
	@Id
	@Column(name = "id")
	long id;
	@Column(name = "model")
	String model;
	@Column(name = "year")
	int year;
	@Column(name = "hand")
	int hand;
	@Column(name = "awd")
	boolean AWD;
/*
	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "carList")
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
*/
	public Car() {
	}

	public Car(long id, String model, int year, int hand, boolean aWD) {
		super();
		this.id = id;
		this.model = model;
		this.year = year;
		this.hand = hand;
		AWD = aWD;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getHand() {
		return hand;
	}

	public void setHand(int hand) {
		this.hand = hand;
	}

	public boolean isAWD() {
		return AWD;
	}

	public void setAWD(boolean aWD) {
		AWD = aWD;
	}
}
