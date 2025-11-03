package com.springpractice.spring_sample.roughPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringSampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(SpringSampleApplication.class, args);
		context.close();
	}
}
