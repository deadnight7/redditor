package com.cpandit.springit;

import com.cpandit.springit.config.RedditorProperties;
import com.cpandit.springit.domain.Comment;
import com.cpandit.springit.domain.Link;
import com.cpandit.springit.repository.CommentRepository;
import com.cpandit.springit.repository.LinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableJpaAuditing
@EnableConfigurationProperties(RedditorProperties.class)
public class SpringitApplication {

	@Autowired
	private ApplicationContext applicationContext;


	//Setting up logger
	private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

	@Bean
	CommandLineRunner runner (LinkRepository linkRepository, CommentRepository commentRepository){
		return args -> {

			//Initializing data using Java's CommandlineRunner Interface
			Link link = new Link("Getting started with Spring Boot 2", "http://google.com");
			linkRepository.save(link);

 			link = new Link("Getting started with Spring Boot 2 Again", "http://google.com");
			linkRepository.save(link);

			Comment comment = new Comment("This spring boot 2 is awesome", link);
			commentRepository.save(comment);
			link.addComment(comment);

			System.out.println("We just inserted a link and a comment...");

			//Get Link by title -
			Link firstLink = linkRepository.findByTitle("Getting started with Spring Boot 2");
			System.out.println("Test : "+ firstLink.getTitle());

			List<Link> allLinksByTitle = linkRepository.findByTitleLikeOrderByCreationDateDesc("%Spring Boot 2%");
			//System.out.println(allLinksByTitle.toString());

			for (Link currentLink : allLinksByTitle){
				System.out.println("currentLink: "+currentLink.getTitle());
			}

		};
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

