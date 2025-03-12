package br.com.pefacil.product.domain.port.spi;

import java.util.List;
import java.util.Optional;

import br.com.pefacil.product.domain.model.Product;

public interface ProductPort {

    Product create(Product product);

    Optional<Product> findById(Long id);

    Optional<Product> findByName(String name);

    List<Product> findAll();

    Product update(Product product, Long id);

    void deleteById(Long id);
}
