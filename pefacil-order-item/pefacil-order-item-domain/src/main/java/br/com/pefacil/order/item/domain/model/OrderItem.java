package br.com.pefacil.order.item.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItem {

    private Long id;
    private Order order;
    private Product product;
    private int quantity;
    private BigDecimal priceAtPurchase;

}
