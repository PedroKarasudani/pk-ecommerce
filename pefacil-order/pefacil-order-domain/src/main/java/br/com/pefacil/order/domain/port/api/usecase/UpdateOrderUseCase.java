package br.com.pefacil.order.domain.port.api.usecase;

import br.com.pefacil.order.domain.exceptions.OrderNotFoundException;
import br.com.pefacil.order.domain.model.Order;
import br.com.pefacil.order.domain.port.api.UpdateOrder;
import br.com.pefacil.order.domain.port.spi.OrderPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class UpdateOrderUseCase implements UpdateOrder {

    private OrderPort port;

    @Override
    public Order update(Order order, Long id) {
        Order foundOrder = this.port.findById(id).orElseThrow(() -> new OrderNotFoundException(id));
        Order foundOrderToUpdate = updateNewInformation(foundOrder, order);
        return this.port.update(foundOrderToUpdate, id);
    }

    private Order updateNewInformation(Order foundOrder, Order order){
        if (order != null) {
            foundOrder.setOrderDate(order.getOrderDate());
        }
        if (order != null) {
            foundOrder.setOrderItems(order.getOrderItems());
        }
        if (order != null) {
            foundOrder.setUser(order.getUser());
        }
        if (order != null) {
            foundOrder.setPayment(order.getPayment());
        }
        return foundOrder;
    }
}
