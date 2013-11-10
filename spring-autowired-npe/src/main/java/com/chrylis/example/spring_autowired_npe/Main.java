package com.chrylis.example.spring_autowired_npe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@EnableAutoConfiguration
@EnableSpringConfigured
@ComponentScan
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
