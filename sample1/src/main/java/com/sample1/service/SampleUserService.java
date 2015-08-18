package com.sample1.service;

import org.springframework.data.domain.Page;

import com.sample1.model.User;

public interface SampleUserService {

	public User getUserById(Long id );
	public User findByLnameAndFname(String lname , String fname );
	public Page<User> getUserPage(Integer pageNumber);
	public Page<User> getUserPage2(Integer pageNumber);

}
