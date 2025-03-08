package br.com.pefacil.order.item.web.facade;

import br.com.pefacil.order.item.domain.port.api.CreateOrderItem;
import br.com.pefacil.order.item.web.converter.OrderItemConverter;
import br.com.pefacil.order.item.web.model.OrderItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemFacade {

    private final OrderItemConverter orderItemConverter = new OrderItemConverter();

    @Autowired
    private CreateOrderItem createOrderItem;

    public OrderItemDTO create(OrderItemDTO orderItemDTO) {
        return orderItemConverter.toDTO(this.createOrderItem.created(orderItemConverter.toDomain(orderItemDTO)));
    }
}
