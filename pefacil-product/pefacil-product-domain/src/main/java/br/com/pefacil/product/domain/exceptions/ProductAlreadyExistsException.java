package br.com.pefacil.product.domain.exceptions;

public class ProductAlreadyExistsException extends RuntimeException {
    public ProductAlreadyExistsException(String name) {
        super("product with " + name + " already exists.");
    }
}
