package br.com.pefacil.product.domain.port.api.usecase;

import br.com.pefacil.product.domain.exceptions.ProductNotFoundException;
import br.com.pefacil.product.domain.port.api.DeleteProduct;
import br.com.pefacil.product.domain.port.spi.ProductPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DeleteProductUseCase implements DeleteProduct {

    private ProductPort port;

    @Override
    public void deleteById(Long id) {
        this.port.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        this.port.deleteById(id);
    }
}
