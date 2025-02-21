package br.com.pefacil.product.domain.port.api.usecase;

import br.com.pefacil.product.domain.model.Product;
import br.com.pefacil.product.domain.port.api.CreateProduct;
import br.com.pefacil.product.domain.port.spi.ProductPort;

public class CreateProductUseCase implements CreateProduct {

    private ProductPort port;

    @Override
    public Product create(Product product) {
        return this.port.create(product);
    }
}
