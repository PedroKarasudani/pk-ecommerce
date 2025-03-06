package br.com.pefacil.order.item.domain.port.api.usecase;

import br.com.pefacil.order.item.domain.model.OrderItem;
import br.com.pefacil.order.item.domain.port.api.CreateOrderItem;

public class CreateOrderItemUseCase implements CreateOrderItem {

    @Override
    public OrderItem created(OrderItem orderItem) {
        return null;
    }
}
