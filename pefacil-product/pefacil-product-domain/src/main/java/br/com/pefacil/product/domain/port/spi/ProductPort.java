package br.com.pefacil.product.domain.port.spi;

import java.util.List;
import java.util.Optional;

import br.com.pefacil.product.domain.model.Product;

public interface ProductPort {

    Product create(Product product);

    Optional<Product> findById(Integer id);

    List<Product> findAll();

    Product update(Product product, Integer id);

    void deleteById(Integer id);
}
