package br.com.pefacil.order.item.domain.port.api.usecase;

import br.com.pefacil.order.item.domain.exception.OrderItemNotFoundException;
import br.com.pefacil.order.item.domain.model.OrderItem;
import br.com.pefacil.order.item.domain.port.api.UpdateOderItem;
import br.com.pefacil.order.item.domain.port.spi.OrderItemPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UpdateOrderItemUseCase implements UpdateOderItem {

    private OrderItemPort port;

    @Override
    public OrderItem update(OrderItem orderItem, Long id) {
        OrderItem foundOrderItem = this.port.findById(id).orElseThrow(() -> new OrderItemNotFoundException(id));
        OrderItem foundOrderItemToUpdate = updateNewInformation(foundOrderItem, orderItem);
        return this.port.update(foundOrderItemToUpdate, id);
    }

    private OrderItem updateNewInformation(OrderItem foundOrderItem, OrderItem updateOrderItem){
        return new OrderItem(
                foundOrderItem.getId(),
                updateOrderItem.getOrder()!= null ? updateOrderItem.getOrder() : foundOrderItem.getOrder(),
                updateOrderItem.getProduct()!= null ? updateOrderItem.getProduct() : foundOrderItem.getProduct(),
                updateOrderItem.getQuantity() >= 0 ? updateOrderItem.getQuantity() : foundOrderItem.getQuantity(),
                updateOrderItem.getPriceAtPurchase()!= null ? updateOrderItem.getPriceAtPurchase() : foundOrderItem.getPriceAtPurchase()
        );
    }
}
