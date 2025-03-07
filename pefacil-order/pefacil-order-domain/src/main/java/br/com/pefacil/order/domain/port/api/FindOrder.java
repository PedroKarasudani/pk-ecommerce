package br.com.pefacil.order.domain.port.api;

import br.com.pefacil.order.domain.model.Order;

import java.util.Optional;

public interface FindOrder {
    Optional<Order> findById(Long id);
}
