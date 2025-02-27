package br.com.pefacil.product.domain.exceptions;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Long id) {
        super("Product with ID: " + id + " 1 not found.");
    }
}
