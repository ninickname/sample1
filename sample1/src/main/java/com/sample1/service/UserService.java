package com.sample1.service;

import java.util.List;



import com.sample1.model.User;
/**
 * 
 * @author Nick
 * the service constains all the buiseness logic 
 * the controller asks for something and the service gets the answer
 * 
 */

public interface UserService {
	
	List<User> getAllUsers();
	User getUserById(long id );
	
}
