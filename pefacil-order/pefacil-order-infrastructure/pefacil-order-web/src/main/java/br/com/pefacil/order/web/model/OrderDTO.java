package br.com.pefacil.order.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDTO {

        private Long id;
        private User user;
        private List<OrderItem> orderItems;
        private Payment payment;
        private LocalDateTime orderDate;

}
