package com.cpandit.springit;

import com.cpandit.springit.config.RedditorProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(RedditorProperties.class)
public class SpringitApplication {

	@Autowired
	private ApplicationContext applicationContext;


	//Setting up logger
	private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

	/*
	@Bean
	CommandLineRunner runner (){
		return args -> {

			/*
			System.out.println("Printing all bean names in application context");
			System.out.println("---------------------");
			String [] beans = applicationContext.getBeanDefinitionNames();

			for (String bean : beans) {
				System.out.println("bean : "+bean);
			}
			*/
	/*
			log.error("Error");
			log.info("Info Message");
			log.warn("Warn Message");
			log.debug("Debug Message");
			log.trace("trace Message");
		};

	}
	*/

}

