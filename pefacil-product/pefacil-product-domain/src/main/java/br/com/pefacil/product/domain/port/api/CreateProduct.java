package br.com.pefacil.product.domain.port.api;

import br.com.pefacil.product.domain.model.Product;

public interface CreateProduct {

    Product create(Product product);
}
