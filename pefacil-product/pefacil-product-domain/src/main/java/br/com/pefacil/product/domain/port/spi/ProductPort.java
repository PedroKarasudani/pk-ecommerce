package br.com.pefacil.product.domain.port.spi;

import java.util.List;

import br.com.pefacil.product.domain.model.Product;

public interface ProductPort {

    Product create(Product product);

    Product findById(Integer id);

    List<Product> findAll();

    Product update(Product product, Integer id);

    void deleteById(Integer id);
}
