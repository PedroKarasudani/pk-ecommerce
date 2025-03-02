package br.com.pefacil.product.persistence;

import br.com.pefacil.product.domain.exceptions.ProductAlreadyExistsException;
import br.com.pefacil.product.domain.model.Product;
import br.com.pefacil.product.domain.port.spi.ProductPort;
import br.com.pefacil.product.persistence.model.ProductEntity;

import java.util.List;
import java.util.Optional;
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
    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id.longValue()).stream().map(ProductEntity::toDomain).findFirst();
    }

    @Override
    public Optional<Product> findByName(String name) {
        return productRepository.findByNameIgnoreCase(name).stream().map(ProductEntity::toDomain).findFirst();
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll().stream().map(x -> x.toDomain()).collect(Collectors.toList());
    }

    @Override
    public Product update(Product updateProduct, Integer id) {
        return productRepository.save(ProductEntity.fromDomain(updateProduct, id)).toDomain();
    }

    @Override
    public void deleteById(Integer id) {
        productRepository.deleteById(id.longValue());
    }

}
