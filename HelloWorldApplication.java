package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApplication {
@RequestMapping("student")
@ResponseBody
String home() {
	return "hello this is pavankalyan";
}
 
 public static void main(String[] args) {
	SpringApplication.run(HelloWorldApplication.class,args);
}
}
