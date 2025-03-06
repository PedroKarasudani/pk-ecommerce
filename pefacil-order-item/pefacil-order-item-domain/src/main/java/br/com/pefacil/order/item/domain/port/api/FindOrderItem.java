package br.com.pefacil.order.item.domain.port.api;

import br.com.pefacil.order.item.domain.model.OrderItem;

public interface FindOrderItem {

    OrderItem findById(Long id);
}
