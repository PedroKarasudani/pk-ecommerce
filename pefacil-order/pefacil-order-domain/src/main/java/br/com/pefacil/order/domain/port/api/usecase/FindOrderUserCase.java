package br.com.pefacil.order.domain.port.api.usecase;

import br.com.pefacil.order.domain.exceptions.OrderNotFoundException;
import br.com.pefacil.order.domain.model.Order;
import br.com.pefacil.order.domain.port.api.FindOrder;
import br.com.pefacil.order.domain.port.spi.OrderPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class FindOrderUserCase implements FindOrder {

    private OrderPort port;

    @Override
    public Optional<Order> findById(Long id) {
        return Optional.of(this.port.findById(id).orElseThrow(() -> new OrderNotFoundException(id)));
    }
}
