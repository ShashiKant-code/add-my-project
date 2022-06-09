package com.springdatajpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdatajpa.component.DataSources;
import com.springdatajpa.configuration.AppConfig;

import javax.persistence.EntityManagerFactory;



public class TestJPA {

    public static void main(String[] args) {
    	
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        
        DataSources ds = context.getBean(DataSources.class);
        ds.run();
        
        EntityManagerFactory emf = context.getBean(EntityManagerFactory.class);
        emf.close();
    }
}
