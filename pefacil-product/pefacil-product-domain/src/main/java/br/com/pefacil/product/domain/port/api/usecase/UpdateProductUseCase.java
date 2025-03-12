package br.com.pefacil.product.domain.port.api.usecase;

import br.com.pefacil.product.domain.exceptions.ProductNotFoundException;
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
        Product foundProduct = this.port.findById(id).orElseThrow(() -> new ProductNotFoundException(id.longValue()));
        ValidateProduct.validate(product, this.port);
        Product foundProductToUpdate = updateNewInformation(product, foundProduct);
        return this.port.update(foundProductToUpdate, id);
    }

    private Product updateNewInformation(Product updateProduct, Product foundProduct) {
        if (updateProduct.getName() != null) {
            foundProduct.setName(updateProduct.getName());
        }
        if (updateProduct.getDescription() != null) {
            foundProduct.setDescription(updateProduct.getDescription());
        }
        if (updateProduct.getPrice() != null) {
            foundProduct.setPrice(updateProduct.getPrice());
        }
        if (updateProduct.getStockQuantity() != null) {
            foundProduct.setStockQuantity(updateProduct.getStockQuantity());
        }
        return foundProduct;
    }
}
