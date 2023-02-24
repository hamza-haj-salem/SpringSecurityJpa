package com.gtt.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRessource {
	
	@GetMapping("/")
	public String home(){
		return ("<h1>Spring security welcome</h1>");
	}
	@GetMapping("/user")
	public String user(){
		return ("<h1>Spring security welcome user user</h1>");
	}
	@GetMapping("/admin")
	public String admin(){
		return ("<h1>Spring security welcome admin admin</h1>");
	}

}
