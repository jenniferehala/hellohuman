package com.codingdojo.hellohuman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String index(
		@RequestParam(value="firstname", required=false) String searchQuery,
		@RequestParam(value="lastname", required=false) String searchQuery2,
		@RequestParam(value="time", required=false) String searchQuery3)
	
	{
		if(searchQuery == null && searchQuery2 == null) {
			return "You searched for : Human";
			
		}
		else if(searchQuery != null && searchQuery2 == null) {
			return "You searched for : " + searchQuery;
		}
		
		else{
			return "You searched for: " + searchQuery + " " + searchQuery2;
		}
		
		
		
	}

}
