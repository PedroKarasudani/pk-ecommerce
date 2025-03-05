package br.com.pefacil.product.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "br.com.pefacil.product.persistence.model")
@ComponentScan(basePackages = "br.com.pefacil.product")
@EnableJpaRepositories(basePackages = "br.com.pefacil.product.persistence")
public class ProductWebApplication {
    public static void main(String[] args) {SpringApplication.run(ProductWebApplication.class, args);}
}
