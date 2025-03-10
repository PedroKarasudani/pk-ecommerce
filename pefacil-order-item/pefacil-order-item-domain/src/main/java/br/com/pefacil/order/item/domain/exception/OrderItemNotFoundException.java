package br.com.pefacil.order.item.domain.exception;

public class OrderItemNotFoundException extends RuntimeException {

  public OrderItemNotFoundException(Long id) {
    super("Order with ID: " + id + " not found.");
  }
}