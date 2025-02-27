package br.com.pefacil.product.domain.exceptions;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Long id) {
        super("Product with ID: " + id + " not found.");
    }
}
