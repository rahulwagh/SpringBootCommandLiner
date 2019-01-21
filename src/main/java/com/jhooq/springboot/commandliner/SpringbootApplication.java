package com.jhooq.springboot.commandliner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author : Rahul Wagh
* **/
@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory
			.getLogger(SpringbootApplication.class);

	public static void main(String[] args) {
		LOG.info("STARTING : Spring boot application starting");
		SpringApplication.run(SpringbootApplication.class, args);
		LOG.info("STOPPED  : Spring boot application stopped");
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("EXECUTING : command line runner");

		for(int i=0;i<=10;i++){
			LOG.info("Count ="+i);
		}
	}
}

