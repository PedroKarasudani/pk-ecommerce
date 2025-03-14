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
    public Product update(Product product, Long id) {
        Product foundProduct = this.port.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        ValidateProduct.validate(product, this.port);
        Product foundProductToUpdate = updateNewInformation(product, foundProduct);
        return this.port.update(foundProductToUpdate, id);
    }

    private Product updateNewInformation(Product updateProduct, Product foundProduct) {
        return new Product(
                foundProduct.getId(),
                updateProduct.getName() != null ? updateProduct.getName() : foundProduct.getName(),
                updateProduct.getDescription() != null ? updateProduct.getDescription() : foundProduct.getDescription(),
                updateProduct.getPrice() != null ? updateProduct.getPrice() : foundProduct.getPrice(),
                updateProduct.getStockQuantity() != null ? updateProduct.getStockQuantity() : foundProduct.getStockQuantity()
        );
    }
}
