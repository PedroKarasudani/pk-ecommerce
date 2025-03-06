package br.com.pefacil.order.item.domain.port.api;

import br.com.pefacil.order.item.domain.model.OrderItem;

public interface UpdateOderItem {

    OrderItem update(OrderItem orderItem, Long id);
}
