package com.pintug.easylearning.jenkin.api;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application Started");
	}

	public static void main(String[] args) {
		logger.info("Application Just Executed !!");
		logger.info("Application Just Executed Test for Pipeline !!");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
