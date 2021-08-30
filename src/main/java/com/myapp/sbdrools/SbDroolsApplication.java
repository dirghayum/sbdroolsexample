package com.myapp.sbdrools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbDroolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbDroolsApplication.class, args);
	}
	
}
