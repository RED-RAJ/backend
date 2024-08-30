package com.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Dto.Users;
import jakarta.websocket.server.PathParam;

@RestController
public class HomeController {
//	 @GetMapping("/users"
//	 public String getuser() {
//		 return "Hi spring boot";
	
	@GetMapping("/mark")
	public int Mark(@RequestParam("num") int a) {
		return a;
	}
	
	@GetMapping("/sub")
	public int sub(@RequestParam("a") int op1, @RequestParam("b") int op2) {
		return op1 - op2;
	}
	@GetMapping("/mul")
	public int mul(@RequestParam("a") int op1, @RequestParam("b") int op2) {
		return op1 * op2;
	}
	@GetMapping("/div/{a}/{b}")
	public int div(@PathParam("a") int op1, @PathVariable("b") int op2) {
		return op1 / op2;
	}
	@PostMapping("/save")
	public String saveUserData(@RequestBody Users users) {
		if(users.getUsername().equals("tony")) {
			return "valid username";
		}
		return "invalid user"	;
	
}
}
