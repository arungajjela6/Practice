package com.example.dockerspringproject.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {
	
	@GetMapping
	public String hello(){
		System.out.println("hxsbjhxbjhbx");
		return "hellow first project";
	}

}
