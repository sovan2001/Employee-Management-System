package com.ems.version001.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ems.version001.model.Employee;
import com.ems.version001.service.EmpService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private EmpService empService;
	
	@GetMapping("/")
	public String hello() {
		return "THis is Homepage";
	}
	
	@PostMapping("/save-user")
	public String saveUser(@RequestBody Employee employee) {
	
		empService.saveMyUser(employee);
		return "User Saved";
	}
}
