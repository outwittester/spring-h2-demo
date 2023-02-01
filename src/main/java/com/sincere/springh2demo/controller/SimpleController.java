package com.sincere.springh2demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class SimpleController{
	@GetMapping("/simple")
	public String rest(){
		return "you got me";
	}		
}
