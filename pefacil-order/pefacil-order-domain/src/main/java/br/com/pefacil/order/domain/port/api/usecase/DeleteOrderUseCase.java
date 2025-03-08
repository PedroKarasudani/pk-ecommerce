package br.com.pefacil.order.domain.port.api.usecase;

import br.com.pefacil.order.domain.exceptions.OrderNotFoundException;
import br.com.pefacil.order.domain.port.api.DeleteOrder;
import br.com.pefacil.order.domain.port.spi.OrderPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DeleteOrderUseCase implements DeleteOrder {

    private OrderPort port;

    @Override
    public void deleteById(Long id) {
        this.port.findById(id).orElseThrow(() -> new OrderNotFoundException(id));
        this.port.deleteById(id);
    }
}
