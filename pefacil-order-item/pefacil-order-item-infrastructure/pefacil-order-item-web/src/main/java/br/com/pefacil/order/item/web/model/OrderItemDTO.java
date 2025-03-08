package br.com.pefacil.order.item.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemDTO {

    private Long id;
    private Order order;
    private Product product;
    private int quantity;
    private BigDecimal priceAtPurchase;

}
