package br.com.pefacil.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "br.com.pefacil.cart.persistence.model")
@ComponentScan(basePackages = "br.com.pefacil.cart")
@EnableJpaRepositories(basePackages = "br.com.pefacil.cart.persistence")
public class CartWebApplication {
    public static void main(String[] args) {SpringApplication.run(CartWebApplication.class, args);}
}
