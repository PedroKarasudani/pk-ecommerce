package br.com.pefacil.order.item.domain.port.api.usecase;

import br.com.pefacil.order.item.domain.model.OrderItem;
import br.com.pefacil.order.item.domain.port.api.CreateOrderItem;
import br.com.pefacil.order.item.domain.port.spi.OrderItemPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderItemUseCase implements CreateOrderItem {

    private OrderItemPort port;

    @Override
    public OrderItem created(OrderItem orderItem) {
        return this.port.created(orderItem);
    }
}
