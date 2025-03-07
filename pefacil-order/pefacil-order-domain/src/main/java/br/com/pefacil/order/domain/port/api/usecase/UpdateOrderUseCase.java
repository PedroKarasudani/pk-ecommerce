package br.com.pefacil.order.domain.port.api.usecase;

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
        return this.port.update(order, id);
    }
}
