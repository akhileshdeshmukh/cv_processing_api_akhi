package com.gslab.talent;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CvProcessingApiApplication {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		SpringApplication.run(CvProcessingApiApplication.class, args);
	}

}
