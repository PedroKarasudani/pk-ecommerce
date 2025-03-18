package br.com.pefacil.web.resources.exception;

import br.com.pefacil.domain.exceptions.CartNotFoundException;
import br.com.pefacil.product.web.resource.exception.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private ResponseEntity<ErrorResponse> buildErrorResponse(String message, HttpStatus status) {
        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(), status.value(), message);
        return new ResponseEntity<>(errorResponse, status);
    }

    @ExceptionHandler(CartNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleProductNotFound(CartNotFoundException e) {
        return buildErrorResponse(e.getMessage(), HttpStatus.NOT_FOUND);
    }

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ErrorResponse> handleDatabaseError(Exception e) {
//        return buildErrorResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//    }

}
