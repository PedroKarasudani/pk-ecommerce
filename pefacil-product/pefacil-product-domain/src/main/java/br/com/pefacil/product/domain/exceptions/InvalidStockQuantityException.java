package br.com.pefacil.product.domain.exceptions;

public class InvalidStockQuantityException extends RuntimeException {
    public InvalidStockQuantityException(Double quantity) {
        super("Invalid stock quantity: " + quantity);
    }
}
