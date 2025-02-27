package br.com.pefacil.product.domain.port.api.usecase;

import br.com.pefacil.product.domain.exceptions.InvalidPriceException;
import br.com.pefacil.product.domain.exceptions.InvalidStockQuantityException;
import br.com.pefacil.product.domain.model.Product;

public class ValidateProduct {

    public static void validate(Product product) {
        if (product.getPrice() < 0 ) {
            throw new InvalidPriceException(product.getPrice());
        }
        if (product.getQuantityStoke() < 0) {
            throw new InvalidStockQuantityException(product.getQuantityStoke());
        }
    }
}
