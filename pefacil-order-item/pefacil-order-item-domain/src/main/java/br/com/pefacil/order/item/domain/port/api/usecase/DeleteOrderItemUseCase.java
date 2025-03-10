package br.com.pefacil.order.item.domain.port.api.usecase;

import br.com.pefacil.order.item.domain.model.OrderItem;
import br.com.pefacil.order.item.domain.port.api.DeleteOrderItem;
import br.com.pefacil.order.item.domain.port.spi.OrderItemPort;

public class DeleteOrderItemUseCase implements DeleteOrderItem {

    private OrderItemPort port;

    @Override
    public void deleteById(Long id) {
        this.port.deleteById(id);
    }
}
