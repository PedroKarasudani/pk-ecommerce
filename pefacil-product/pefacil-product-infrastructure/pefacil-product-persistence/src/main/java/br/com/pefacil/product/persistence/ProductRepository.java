package br.com.pefacil.product.persistence;

import br.com.pefacil.product.domain.model.Product;
import br.com.pefacil.product.domain.port.spi.ProductPort;

public class ProductRepository implements ProductPort {

    @Override
    public Product create(Product product) {
        return null;
    }

    @Override
    public Product findById(Integer id) {
        return null;
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
