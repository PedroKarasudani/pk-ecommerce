package br.com.pefacil.product.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Product {

    private Long id;
    private String name;
    private String description;
    private Double quantityStoke;
    private Double price;

}
