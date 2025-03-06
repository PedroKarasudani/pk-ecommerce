package br.com.pefacil.order.item.persistence;

import br.com.pefacil.order.item.domain.model.OrderItem;
import br.com.pefacil.order.item.domain.port.spi.OrderItemPort;
import org.springframework.stereotype.Component;

@Component
public class OrderItemRepositoryAdapter implements OrderItemPort {

    private OrderItemRepository orderItemRepository;

    public OrderItemRepositoryAdapter(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public OrderItem created(OrderItem orderItem) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public OrderItem findById(Long id) {
        return null;
    }

    @Override
    public OrderItem update(OrderItem orderItem, Long id) {
        return null;
    }
}
