package br.com.pefacil.product.domain.port.api;

import java.util.List;
import java.util.Optional;

import br.com.pefacil.product.domain.model.Product;

public interface FindProduct {

    Optional<Product> findById(Integer id);

    Optional<Product> findByName(String name);

    List<Product> findAll();
}
