package org.com.doodleblue.controller;

import org.com.doodleblue.model.user;
import org.com.doodleblue.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
	
	@Autowired
	private userService usrsrv;
	
	
	
	
	
	@GetMapping("/getallusers")
	public String allUsers()
	{
		return usrsrv.findAll().toString();
		
	}
	
	@GetMapping("/getuser")
	public String returnuser(@RequestParam int id)
	
	{
		
		return usrsrv.findone(id);
		
	}
	
	@GetMapping("/saveuser")
	public String saveUser(@RequestParam String name,@RequestParam int mobilenumber,@RequestParam int age,@RequestParam String emailid,@RequestParam String address,@RequestParam String gender,@RequestParam String image)
	{
		user usr= new user(name,mobilenumber,age,emailid,address,gender,image);
		
		usrsrv.saveUser(usr);
		
		return"the user is saved";
		
		
	}
	
	
	
	

	
}
