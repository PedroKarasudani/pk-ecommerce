package br.com.pefacil.user.domain.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Product with ID: " + id + " not found.");
    }
}
