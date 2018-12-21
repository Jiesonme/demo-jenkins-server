package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class DemoApi {
	
	@GetMapping("test")
	public String getTesty() {
		System.out.println("这是一个demo!");
		return "HELLOW WORD";
	}

}
