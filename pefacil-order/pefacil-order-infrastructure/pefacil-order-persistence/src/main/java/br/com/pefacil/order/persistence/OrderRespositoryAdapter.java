package br.com.pefacil.order.persistence;

import br.com.pefacil.order.domain.model.Order;
import br.com.pefacil.order.domain.port.spi.OrderPort;
import br.com.pefacil.order.persistence.model.OrderEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OrderRespositoryAdapter implements OrderPort {

    private final OrderRepository repository;

    public OrderRespositoryAdapter(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Order create(Order order) {
        return repository.save(OrderEntity.fromDomain(order)).toDomain();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Order> findById(Long id) {
        return repository.findById(id).stream().map(OrderEntity::toDomain).findFirst();
    }

    @Override
    public Order update(Order order, Long id) {
        return repository.save(OrderEntity.fromDomain(order, id)).toDomain();
    }
}
