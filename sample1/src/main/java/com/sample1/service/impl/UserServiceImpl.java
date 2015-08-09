package com.sample1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample1.dao.UserRepository;
import com.sample1.model.User;
import com.sample1.service.UserService;



/**
 * 
 * @author Nick
 * here in the service we will ask the REPOSITORY for some info , do some black magic with it ,
 * and return to the caller of the service the required information 
 * 
 */

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired(required = true)
	UserRepository userRepo;
	
	@Override
	public List<User> getAllUsers() {
		
		return userRepo.findAll();
	}

	@Override
	public User getUserById(long id) {
		System.out.println("UserServiceImpl: getUserById : yaya atleast we got here    ");
		return null;
	}

}
