package com.sample1.model;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Phone {

	@Id
	Long number;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner_id")
	private User owner;
	
	
	/*additional data*/
	 public void setOwner(User user) {
	        this.owner = user;
	        if (!user.getPhones().contains(this)) {
	        	user.getPhones().add(this);
	        }
	    }
	 
	/*POJO*/
	public Phone(Long number, User owner) {
		super();
		this.number = number;
		this.owner = owner;
	}

	public Long getNumber() {
		return number;
	}

	public User getOwner() {
		return owner;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

}
