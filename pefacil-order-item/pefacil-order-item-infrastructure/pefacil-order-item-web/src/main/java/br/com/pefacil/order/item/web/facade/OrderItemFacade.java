package br.com.pefacil.order.item.web.facade;

import br.com.pefacil.order.item.domain.port.api.CreateOrderItem;
import br.com.pefacil.order.item.domain.port.api.DeleteOrderItem;
import br.com.pefacil.order.item.domain.port.api.FindOrderItem;
import br.com.pefacil.order.item.domain.port.api.UpdateOderItem;
import br.com.pefacil.order.item.web.converter.OrderItemConverter;
import br.com.pefacil.order.item.web.model.OrderItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemFacade {

    private final OrderItemConverter orderItemConverter = new OrderItemConverter();

    @Autowired
    private CreateOrderItem createOrderItem;

    @Autowired
    private FindOrderItem findOrderItem;

    @Autowired
    private UpdateOderItem updateOderItem;

    @Autowired
    private DeleteOrderItem deleteOrderItem;

    public OrderItemDTO create(OrderItemDTO orderItemDTO) {
        return orderItemConverter.toDTO(this.createOrderItem.created(orderItemConverter.toDomain(orderItemDTO)));
    }

    public OrderItemDTO findById(Long id) {
        return orderItemConverter.toDTO(this.findOrderItem.findById(id).get());
    }

    public OrderItemDTO update(OrderItemDTO orderItemDTO, Long id) {
        return orderItemConverter.toDTO(this.updateOderItem.update(orderItemConverter.toDomain(orderItemDTO),id));
    }

    public void delete(Long id) {
        this.deleteOrderItem.deleteById(id);
    }
}
