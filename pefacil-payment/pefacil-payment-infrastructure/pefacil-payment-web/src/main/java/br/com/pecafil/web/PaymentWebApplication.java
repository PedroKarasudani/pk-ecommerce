package br.com.pecafil.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "br.com.pefacil.payment.persistence.model")
@ComponentScan(basePackages = "br.com.pefacil.payment")
@EnableJpaRepositories(basePackages = "br.com.pefacil.payment.persistence")
public class PaymentWebApplication {
    public static void main(String[] args) {SpringApplication.run(PaymentWebApplication.class, args);}
}
