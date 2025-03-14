package br.com.pefacil.order.item.persistence;

import br.com.pefacil.order.item.domain.model.OrderItem;
import br.com.pefacil.order.item.domain.port.spi.OrderItemPort;
import br.com.pefacil.order.item.persistence.model.OrderItemEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OrderItemRepositoryAdapter implements OrderItemPort {

    private final OrderItemRepository orderItemRepository;

    public OrderItemRepositoryAdapter(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public OrderItem created(OrderItem orderItem) {
        return orderItemRepository.save(OrderItemEntity.fromDomain(orderItem, null)).toDomain();
    }

    @Override
    public void deleteById(Long id) {
        orderItemRepository.deleteById(id);
    }

    @Override
    public Optional<OrderItem> findById(Long id) {
        return orderItemRepository.findById(id).stream().map(OrderItemEntity::toDomain).findFirst();
    }

    @Override
    public OrderItem update(OrderItem orderItem, Long id) {
        return orderItemRepository.save(OrderItemEntity.fromDomain(orderItem, id)).toDomain();
    }
}
