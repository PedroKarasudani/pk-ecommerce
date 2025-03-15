package br.com.pefacil.user.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "br.com.pefacil.user.persistence.model")
@ComponentScan(basePackages = "br.com.pefacil.user")
@EnableJpaRepositories(basePackages = "br.com.pefacil.user.persistence")
public class UserWebApplication {
    public static void main(String[] args) {SpringApplication.run(UserWebApplication.class, args);}
}
