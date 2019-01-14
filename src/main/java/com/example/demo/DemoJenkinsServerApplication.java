package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsServerApplication.class, args);
		System.out.println("当前时间戳="+System.currentTimeMillis());
	}

}

