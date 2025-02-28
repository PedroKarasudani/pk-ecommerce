package br.com.pefacil.product.persistence;

import br.com.pefacil.product.domain.exceptions.ProductAlreadyExistsException;
import br.com.pefacil.product.domain.exceptions.ProductNotFoundException;
import br.com.pefacil.product.domain.model.Product;
import br.com.pefacil.product.domain.port.spi.ProductPort;
import br.com.pefacil.product.persistence.model.ProductEntity;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

@Component
public class ProductRepositoryAdapter implements ProductPort {

    private final ProductRepository productRepository;

    public ProductRepositoryAdapter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product create(Product product) {
        ProductEntity productEntity = ProductEntity.fromDomain(product);
        try {
            productEntity = productRepository.save(productEntity);
        } catch (DataIntegrityViolationException e) {
            throw new ProductAlreadyExistsException(product.getName());
        }
        return productEntity.toDomain();
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findById(id.longValue()).orElseThrow(() -> new ProductNotFoundException(id.longValue())).toDomain();
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll().stream().map(x -> x.toDomain()).collect(Collectors.toList());
    }

    @Override
    public Product update(Product updateProduct, Integer id) {
        return updateNewProductEntity(updateProduct, id).toDomain();
    }

    @Override
    public void deleteById(Integer id) {
        productRepository.deleteById(id.longValue());
    }

    private ProductEntity updateNewProductEntity(Product updateProduct, Integer id) {
        ProductEntity product = productRepository.findById(id.longValue()).get();
        product.setName(updateProduct.getName());
        product.setDescription(updateProduct.getDescription());
        product.setPrice(updateProduct.getPrice());
        product.setQuantityStoke(updateProduct.getQuantityStoke());
        return product = productRepository.save(product);
    }
}
