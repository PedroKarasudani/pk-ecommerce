package br.com.pefacil.order.domain.port.api.usecase;

import br.com.pefacil.order.domain.model.Order;
import br.com.pefacil.order.domain.port.api.CreateOrder;
import br.com.pefacil.order.domain.port.spi.OrderPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderUseCase implements CreateOrder {

    private OrderPort port;

    @Override
    public Order create(Order order) {
        return this.port.create(order);
    }
}
