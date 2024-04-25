package com.nrt.studio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
public class EStudioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EStudioApplication.class, args);
		
	 log.info("applicaiton is started successully ....");
	}

}
