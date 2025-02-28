package br.com.pefacil.product.persistence.exceptions;

public class DatabaseErrorException extends RuntimeException {
  public DatabaseErrorException(String message) {
    super("Error accessing the database: " + message);
  }
}
