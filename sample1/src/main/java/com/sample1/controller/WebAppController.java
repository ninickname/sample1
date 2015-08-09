package com.sample1.controller;


import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sample1.model.User;
import com.sample1.service.UserService;

@Controller

public class WebAppController {

	@Autowired(required = true )
	private UserService userService;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody  List<User> get() {
		return userService.getAllUsers();
	}

//	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
//	@ResponseStatus(HttpStatus.OK)
//	public @ResponseBody  User get(@Parm id) {
//		return userService.getUsers(id);
//	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String home() {
		System.out.println("HomeController: Passing through...");
		
		userService.getUserById(321L);
		return "welcome";
	}

}
