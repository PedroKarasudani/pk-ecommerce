package br.com.pefacil.order.item.domain.port.api.usecase;

import br.com.pefacil.order.item.domain.exception.OrderItemNotFoundException;
import br.com.pefacil.order.item.domain.model.OrderItem;
import br.com.pefacil.order.item.domain.port.api.FindOrderItem;
import br.com.pefacil.order.item.domain.port.spi.OrderItemPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class FindOrderItemUseCase implements FindOrderItem {

    private OrderItemPort port;

    @Override
    public Optional<OrderItem> findById(Long id) {
        return Optional.of(this.port.findById(id).orElseThrow(() -> new OrderItemNotFoundException(id)));
    }
}
