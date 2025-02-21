package br.com.pefacil.product.domain.port.api.usecase;

import br.com.pefacil.product.domain.port.api.DeleteProduct;
import br.com.pefacil.product.domain.port.spi.ProductPort;

public class DeleteProductUseCase implements DeleteProduct {

    private ProductPort port;

    @Override
    public void deleteById(Integer id) {
        this.port.deleteById(id);
    }
}
