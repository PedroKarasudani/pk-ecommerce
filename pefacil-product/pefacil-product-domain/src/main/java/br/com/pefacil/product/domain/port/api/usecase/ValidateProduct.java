package br.com.pefacil.product.domain.port.api.usecase;

import br.com.pefacil.product.domain.exceptions.InvalidPriceException;
import br.com.pefacil.product.domain.exceptions.InvalidStockQuantityException;
import br.com.pefacil.product.domain.exceptions.ProductAlreadyExistsException;
import br.com.pefacil.product.domain.model.Product;
import br.com.pefacil.product.domain.port.spi.ProductPort;

import java.util.Optional;

public class ValidateProduct {

    public static void validate(Product product, ProductPort port) {
        Product p = port.findByName(product.getName()).orElse(null);

        if (product.getPrice() < 0 ) {
            throw new InvalidPriceException(product.getPrice());
        }
        if (product.getStockQuantity() < 0) {
            throw new InvalidStockQuantityException(product.getStockQuantity());
        }

        if(p != null && p.getName().equals(product.getName())) {
            throw new ProductAlreadyExistsException(product.getName());
        }
    }
}
