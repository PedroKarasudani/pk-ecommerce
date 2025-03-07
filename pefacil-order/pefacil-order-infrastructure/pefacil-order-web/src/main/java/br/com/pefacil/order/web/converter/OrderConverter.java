package br.com.pefacil.order.web.converter;

import br.com.pefacil.order.domain.model.Order;
import br.com.pefacil.order.web.model.OrderDTO;

import java.util.List;
import java.util.stream.Collectors;

public class OrderConverter {

    public Order toDomain(OrderDTO orderDTO) {
        return Order.builder()
                .id(orderDTO.getId())
                .user(orderDTO.getUser())
                .orderItems(orderDTO.getOrderItems())
                .orderDate(orderDTO.getOrderDate())
                .payment(orderDTO.getPayment())
                .build();
    }

    public OrderDTO toDTO(Order order) {
        return OrderDTO.builder()
                .id(order.getId())
                .user(order.getUser())
                .orderItems(order.getOrderItems())
                .orderDate(order.getOrderDate())
                .payment(order.getPayment())
                .build();
    }

    public List<OrderDTO> toDTO(List<Order> order){
        return order.stream()
                .map(x -> OrderDTO.builder()
                        .id(x.getId())
                        .user(x.getUser())
                        .orderItems(x.getOrderItems())
                        .orderDate(x.getOrderDate())
                        .payment(x.getPayment())
                        .build())
                .collect(Collectors.toList());
    }
}
