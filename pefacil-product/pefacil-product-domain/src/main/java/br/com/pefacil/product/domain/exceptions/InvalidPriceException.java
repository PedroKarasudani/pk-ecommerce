package br.com.pefacil.product.domain.exceptions;

public class InvalidPriceException extends RuntimeException {
    public InvalidPriceException(Double price) {
        super("Invalid price: " + price);
    }
}
