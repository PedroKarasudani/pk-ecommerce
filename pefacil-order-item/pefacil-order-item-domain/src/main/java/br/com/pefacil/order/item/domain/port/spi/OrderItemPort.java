package br.com.pefacil.order.item.domain.port.spi;

import br.com.pefacil.order.item.domain.model.OrderItem;

public interface OrderItemPort {

    OrderItem created(OrderItem orderItem);

    void deleteById(Long id);

    OrderItem findById(Long id);

    OrderItem update(OrderItem orderItem, Long id);
}
