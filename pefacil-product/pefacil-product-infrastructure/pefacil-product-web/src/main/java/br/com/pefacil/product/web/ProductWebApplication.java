package br.com.pefacil.product.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "br.com.pefacil.product.persistence.model")
@ComponentScan(basePackages = "br.com.pefacil.product")
public class ProductWebApplication {
    public static void main(String[] args) {SpringApplication.run(ProductWebApplication.class, args);}
}
