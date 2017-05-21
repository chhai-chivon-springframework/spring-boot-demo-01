package com.chhaichivon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;




//@ComponentScan() //  user when we have code inside base package 
@SpringBootApplication
public class SpringBootDemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo01Application.class, args);
	}
}
