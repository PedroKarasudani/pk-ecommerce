package br.com.pefacil.persistence.repository;

import br.com.pefacil.persistence.model.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartEntity, Long> {
}
