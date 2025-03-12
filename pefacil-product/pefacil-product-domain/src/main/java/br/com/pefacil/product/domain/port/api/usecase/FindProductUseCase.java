package br.com.pefacil.product.domain.port.api.usecase;

import java.util.List;
import java.util.Optional;

import br.com.pefacil.product.domain.exceptions.ProductNotFoundException;
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
    public Optional<Product> findById(Long id) {
        return Optional.of(this.port.findById(id).orElseThrow(() -> new ProductNotFoundException(id)));
    }

    @Override
    public Optional<Product> findByName(String name) {
        return Optional.of(this.port.findByName(name).orElseThrow(() -> new ProductNotFoundException(name)));
    }

    @Override
    public List<Product> findAll() {
        return this.port.findAll();        
    }
}
