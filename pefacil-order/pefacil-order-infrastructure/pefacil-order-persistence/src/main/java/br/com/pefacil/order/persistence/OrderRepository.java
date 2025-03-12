package br.com.pefacil.order.persistence;

import br.com.pefacil.order.persistence.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
