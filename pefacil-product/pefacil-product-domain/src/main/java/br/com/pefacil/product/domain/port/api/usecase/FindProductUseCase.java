package br.com.pefacil.product.domain.port.api.usecase;

import java.util.List;

import br.com.pefacil.product.domain.model.Product;
import br.com.pefacil.product.domain.port.api.FindProduct;
import br.com.pefacil.product.domain.port.spi.ProductPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class FindProductUseCase implements FindProduct {

    private ProductPort port;

    @Override
    public Product findById(Integer id) {
        return this.port.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return this.port.findAll();        
    }
}
