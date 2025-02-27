package br.com.pefacil.product.domain.port.api.usecase;

import br.com.pefacil.product.domain.exceptions.ProductAlreadyExistsException;
import br.com.pefacil.product.domain.model.Product;
import br.com.pefacil.product.domain.port.api.CreateProduct;
import br.com.pefacil.product.domain.port.spi.ProductPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CreateProductUseCase implements CreateProduct {

    private ProductPort port;

    @Override
    public Product create(Product product) {
        ValidateProduct.validate(product);
        return this.port.create(product);
    }
}
