package br.com.pefacil.product.domain.port.api;

import java.util.List;

import br.com.pefacil.product.domain.model.Product;

public interface FindProduct {

    Product findById(Integer id);

    List<Product> findAll();
}
