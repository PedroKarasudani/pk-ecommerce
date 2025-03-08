package br.com.pefacil.order.item.web.converter;

import br.com.pefacil.order.item.domain.model.OrderItem;
import br.com.pefacil.order.item.web.model.OrderItemDTO;

public class OrderItemConverter {

    public OrderItem toDomain(OrderItemDTO orderItemDTO){
        return OrderItem.builder()
                .id(orderItemDTO.getId())
                .order(orderItemDTO.getOrder())
                .product(orderItemDTO.getProduct())
                .quantity(orderItemDTO.getQuantity())
                .priceAtPurchase(orderItemDTO.getPriceAtPurchase())
                .build();
    }

    public OrderItemDTO toDTO(OrderItem orderItem) {
        return OrderItemDTO.builder()
                .id(orderItem.getId())
                .order(orderItem.getOrder())
                .product(orderItem.getProduct())
                .quantity(orderItem.getQuantity())
                .priceAtPurchase(orderItem.getPriceAtPurchase())
                .build();
    }
}
