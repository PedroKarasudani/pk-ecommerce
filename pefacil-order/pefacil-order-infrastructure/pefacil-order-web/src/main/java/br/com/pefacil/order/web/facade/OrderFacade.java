package br.com.pefacil.order.web.facade;

import br.com.pefacil.order.domain.model.Order;
import br.com.pefacil.order.domain.port.api.CreateOrder;
import br.com.pefacil.order.domain.port.api.DeleteOrder;
import br.com.pefacil.order.domain.port.api.FindOrder;
import br.com.pefacil.order.domain.port.api.UpdateOrder;
import br.com.pefacil.order.web.converter.OrderConverter;
import br.com.pefacil.order.web.model.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderFacade {

    private final OrderConverter orderConverter = new OrderConverter();

    @Autowired
    private CreateOrder createOrder;
    @Autowired
    private FindOrder findOrder;
    @Autowired
    private UpdateOrder updateOrder;
    @Autowired
    private DeleteOrder deleteOrder;

    public OrderDTO create(OrderDTO orderDTO){
        Order order = this.orderConverter.toDomain(orderDTO);
        return orderConverter.toDTO(this.createOrder.create(order));
    }

    public OrderDTO findById(Long id) {
        return orderConverter.toDTO(this.findOrder.findById(id).get());
    }

    public OrderDTO update(OrderDTO orderDTO, Long id) {
        Order order = orderConverter.toDomain(orderDTO);
        return orderConverter.toDTO(this.updateOrder.update(order, id));
    }

    public void deleteById(Long id) {
        this.deleteOrder.deleteById(id);
    }
}
