package br.com.pefacil.domain.exceptions;

public class CartNotFoundException extends RuntimeException {
    public CartNotFoundException(Long id) {
        super("Cart with ID: " + id + " not found.");
    }
}
