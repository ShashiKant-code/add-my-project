package com.springdatajpa.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



@EnableJpaRepositories("com.springdatajpa.repository")
@ComponentScan("com.springdatajpa.component")
@Configuration
public class AppConfig {

    @Bean
    EntityManagerFactory entityManagerFactory() {
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("JPATestApp");
        return emf;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory());
        return txManager;
    }
}