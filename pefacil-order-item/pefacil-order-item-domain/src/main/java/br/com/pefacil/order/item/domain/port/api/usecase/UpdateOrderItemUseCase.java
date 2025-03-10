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
        if (updateOrderItem.getOrder()!= null) {
            foundOrderItem.setOrder(updateOrderItem.getOrder());
        }
        if (updateOrderItem.getProduct() != null) {
            foundOrderItem.setProduct(updateOrderItem.getProduct());
        }
        if (updateOrderItem.getQuantity() >= 0) {
            foundOrderItem.setQuantity(updateOrderItem.getQuantity());
        }
        if (updateOrderItem.getPriceAtPurchase() != null) {
            foundOrderItem.setPriceAtPurchase(updateOrderItem.getPriceAtPurchase());
        }
        return foundOrderItem;
    }
}
