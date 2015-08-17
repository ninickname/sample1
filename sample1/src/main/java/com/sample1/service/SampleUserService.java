package com.sample1.service;

import com.sample1.model.User;

public interface SampleUserService {

	public User getUserById(Long id );
	public User findByLnameAndFname(String lname , String fname );

}
