package com.springdatajpa;

import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdatajpa.component.DataSources;
import com.springdatajpa.configuration.AppConfig;

@SpringBootApplication
public class SpringDataJpaGettingStartedBeanStyleApplication {

	public static void main(String[] args) {
		
			SpringApplication.run(SpringDataJpaGettingStartedBeanStyleApplication.class, args);
		
			AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
	        
	        DataSources ds = context.getBean(DataSources.class);
	        ds.run();
	        
	        EntityManagerFactory emf = context.getBean(EntityManagerFactory.class);
	        emf.close();
	}

}
