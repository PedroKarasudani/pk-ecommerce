package br.com.pefacil.product.persistence;

import br.com.pefacil.product.persistence.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    Optional<ProductEntity> findByNameIgnoreCase(String name);
}
