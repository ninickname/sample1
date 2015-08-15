package com.sample1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phones")

public class Phone {
  @Id
  @Column(name="number")

  private long number;

  @Column(name="owner_id")
  private long owner_id;
  
  public Phone() {
		super();
	}

public Phone(long number) {
	super();
	this.number = number;
}

public Phone(long number, long owner_id) {
	super();
	this.number = number;
	this.owner_id = owner_id;
}

public long getNumber() {
	return number;
}

public long getOwner_id() {
	return owner_id;
}

public void setNumber(long number) {
	this.number = number;
}

public void setOwner_id(long owner_id) {
	this.owner_id = owner_id;
}
    
  

}