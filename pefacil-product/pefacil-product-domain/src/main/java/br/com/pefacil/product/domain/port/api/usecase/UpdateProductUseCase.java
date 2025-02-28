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
        Product foundProduct = this.port.findById(id).get();
        foundProduct = updateNewInformation(foundProduct, foundProduct);
        return this.port.update(foundProduct, id);
    }

    private Product updateNewInformation(Product updateProduct, Product foundProduct) {
        foundProduct.setName(updateProduct.getName());
        foundProduct.setDescription(updateProduct.getDescription());
        foundProduct.setPrice(updateProduct.getPrice());
        foundProduct.setQuantityStoke(updateProduct.getQuantityStoke());
        return foundProduct;
    }
}
