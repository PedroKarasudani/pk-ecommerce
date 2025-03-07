package br.com.pefacil.order.domain.port.spi;

import br.com.pefacil.order.domain.model.Order;

import java.util.Optional;

public interface OrderPort {

    Order create(Order order);

    void deleteById(Long id);

    Optional<Order> findById(Long id);

    Order update(Order order, Long id);
}
