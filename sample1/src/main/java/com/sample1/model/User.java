package com.sample1.model;

public class User {

	private String name;
	private long age;
	private User wife;
	public User() {
		super();
	}
	public User(String name, long age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public User getWife() {
		return wife;
	}
	public void setWife(User wife) {
		this.wife = wife;
	}
	
}
