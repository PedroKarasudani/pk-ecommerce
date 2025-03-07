package br.com.pefacil.order.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "br.com.pefacil.order.persistence.model")
@ComponentScan(basePackages = "br.com.pefacil.order")
@EnableJpaRepositories(basePackages = "br.com.pefacil.order.persistence")
public class OrderWebApplication {
    public static void main(String[] args){
        SpringApplication.run(OrderWebApplication.class, args);}
}