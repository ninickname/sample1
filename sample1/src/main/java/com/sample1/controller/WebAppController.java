package com.sample1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sample1.model.User;

@Controller
//@RequestMapping("/")
public class WebAppController {

	/*
	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "Hello World from Spring 4 MVC");
		return "welcome";
	}

	@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
		return "welcome";
	}
	*/
	
	// crud
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody User get() {
		User user = new User();
		user.setName("Bloop");
		user.setAge(3);
		user.setWife(new User("hjyfhg",5));
		return user;
	}

	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String home() {
		System.out.println("HomeController: Passing through...");
		return "welcome";
	}

}
