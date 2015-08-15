package com.sample1.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sample1.model.User;
import com.sample1.service.UserService;



/**
 * the @RestController instead the @Controller is used as a eye candy just to
 * get rid of all the the @ResponseBody annotations
 * 
 * @author Nick
 *
 */
@RestController
public class WebAppController {
	
	@Autowired(required = true )
	private UserService userService;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public  List<User> get() {
		return userService.getAllUsers();
	}
}
