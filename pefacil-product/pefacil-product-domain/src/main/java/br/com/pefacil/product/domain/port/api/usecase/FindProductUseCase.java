package br.com.pefacil.product.domain.port.api.usecase;

import br.com.pefacil.product.domain.model.Product;
import br.com.pefacil.product.domain.port.api.FindProduct;
import br.com.pefacil.product.domain.port.spi.ProductPort;

public class FindProductUseCase implements FindProduct {

    private ProductPort port;

    @Override
    public Product findById(Integer id) {
        return port.findById(id);
    }
}
