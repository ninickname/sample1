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
//@RequestMapping("/")
public class WebAppController {

	@Autowired(required = true )
	private UserService userService;
	
	/*
	@Autowired
	private DataSource datasource;
	*/
	
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
	
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody  List<User> get() {
		return userService.getAllUsers();
		
		
/*
		
		try {
			Connection  con = datasource.getConnection();
			System.out.println("we got a fking connection ! ");
			
			String selectSQL = "SELECT * FROM `users`";
			PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
			ResultSet rs = preparedStatement.executeQuery(selectSQL );

			while (rs.next()) {
				String id = rs.getString("id");
				String fname = rs.getString("first_name");	
				String lname = rs.getString("last_name");	
				String address = rs.getString("address");	
				
				System.out.println( id + fname  + lname + address);
			}
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String home() {
		System.out.println("HomeController: Passing through...");
		
		userService.getUserById(321L);
		return "welcome";
	}

}
