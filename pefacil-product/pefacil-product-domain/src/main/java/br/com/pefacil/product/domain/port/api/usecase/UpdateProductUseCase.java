package br.com.pefacil.product.domain.port.api.usecase;

import br.com.pefacil.product.domain.model.Product;
import br.com.pefacil.product.domain.port.api.UpdateProduct;
import br.com.pefacil.product.domain.port.spi.ProductPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductUseCase implements UpdateProduct {

    private ProductPort port;

    @Override
    public Product update(Product product, Integer id) {
        return this.port.update(product, id);
    }
}
