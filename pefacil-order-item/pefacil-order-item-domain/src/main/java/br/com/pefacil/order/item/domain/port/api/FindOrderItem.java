package br.com.pefacil.order.item.domain.port.api;

import br.com.pefacil.order.item.domain.model.OrderItem;

import java.util.Optional;

public interface FindOrderItem {

    Optional<OrderItem> findById(Long id);
}
