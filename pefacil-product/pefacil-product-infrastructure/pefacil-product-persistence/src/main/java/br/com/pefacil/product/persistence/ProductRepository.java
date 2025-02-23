package br.com.pefacil.product.persistence;

import br.com.pefacil.product.domain.exceptions.ProductNotFoundException;
import br.com.pefacil.product.domain.model.Product;
import br.com.pefacil.product.domain.port.spi.ProductPort;
import br.com.pefacil.product.persistence.model.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductRepository implements ProductPort {

    private final Map<Long, ProductEntity> productMap = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    @Override
    public Product create(Product product) {
        Long id = idGenerator.getAndIncrement();
        ProductEntity productEntity = ProductEntity.fromDomain(product);
        productMap.put(id, productEntity);
        return productEntity.toDomain();
    }

    @Override
    public Product findById(Integer id) {
        ProductEntity productEntity = productMap.get(id.longValue());
        if (productEntity == null) {
            throw new ProductNotFoundException("Product with id" + id.longValue() + " was not found");
        }
        return productEntity.toDomain();
    }

    @Override
    public Product update(Product product, Integer id) {
        if (id == null || !productMap.containsKey(id.longValue())) {
            throw new ProductNotFoundException("Product not found");
        }
        ProductEntity productEntity = ProductEntity.fromDomain(product);
        productMap.put(id.longValue(), productEntity);
        return productEntity.toDomain();
    }

    @Override
    public void deleteById(Integer id) {
        productMap.remove(id.longValue());
    }
}
