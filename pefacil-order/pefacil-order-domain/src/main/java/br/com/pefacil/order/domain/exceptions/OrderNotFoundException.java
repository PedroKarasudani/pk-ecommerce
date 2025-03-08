package br.com.pefacil.order.domain.exceptions;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
        super("Order with ID: " + id + " not found.");
    }
}
