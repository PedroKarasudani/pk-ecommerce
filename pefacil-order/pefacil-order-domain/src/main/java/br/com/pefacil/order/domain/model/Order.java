package br.com.pefacil.order.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

    private Long id;
    private User user;
    private List<OrderItem> orderItems;
    private Payment payment;
    private LocalDateTime orderDate;

}
