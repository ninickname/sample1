package com.sample1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sample1.model.User;
import com.sample1.service.SampleUserService;
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

	@Autowired(required = true)
	private UserService userService;

	@Autowired(required = true)
	private SampleUserService sampleUserService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<User> get() {
		return userService.getAllUsers();
	}

	@RequestMapping(value = "/user/{userId} ", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public User getUserById(@PathVariable Long userId) {
		User u = sampleUserService.getUserById(userId);
		System.out.println(u);
		return u;
	}

	
	// usage example : 
	//http://localhost:8080/sample1/getUserByLnameAndFname?fname=fname100&lname=lname100
	//fname100 and lname100 are values of fname and lname correspondingly
	@RequestMapping(value = "/getUserByLnameAndFname", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public User getUserByLnameAndFname(HttpServletRequest request, String fname, String lname) {
		return sampleUserService.findByLnameAndFname(lname, fname);
	}
	
	@RequestMapping(value = "/pages/users/{pageNumber}", method = RequestMethod.GET)
	public Page getRunbookPage(@PathVariable Integer pageNumber ) {
	    Page<User> page = sampleUserService.getUserPage(pageNumber);
	    return page;
	}
	
	@RequestMapping(value = "/pages/users2/{pageNumber}", method = RequestMethod.GET)
	public Page getRunbookPage2(@PathVariable Integer pageNumber ) {
	    Page<User> page = sampleUserService.getUserPage2(pageNumber);
	    return page;
	}
}
