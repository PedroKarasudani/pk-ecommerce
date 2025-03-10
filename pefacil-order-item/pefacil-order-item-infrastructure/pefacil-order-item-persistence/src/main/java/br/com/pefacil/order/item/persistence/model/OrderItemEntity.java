package br.com.pefacil.order.item.persistence.model;

import br.com.pefacil.order.item.domain.model.OrderItem;
import br.com.pefacil.order.item.persistence.OrderItemRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_order_items")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    private int quantity;

    private BigDecimal priceAtPurchase;

    public static OrderItemEntity fromDomain(OrderItem orderItem) {
        return OrderItemEntity.builder()
                .id(orderItem.getId())
                .order(orderItem.getOrder())
                .product(orderItem.getProduct())
                .quantity(orderItem.getQuantity())
                .priceAtPurchase(orderItem.getPriceAtPurchase())
                .build();
    }

    public static OrderItemEntity fromDomain(OrderItem orderItem, Long id) {
        return OrderItemEntity.builder()
                .id(id)
                .order(orderItem.getOrder())
                .product(orderItem.getProduct())
                .quantity(orderItem.getQuantity())
                .priceAtPurchase(orderItem.getPriceAtPurchase())
                .build();
    }

    public OrderItem toDomain() {
        return OrderItem.builder()
                .id(this.getId())
                .order(this.getOrder())
                .product(this.getProduct())
                .quantity(this.getQuantity())
                .priceAtPurchase(this.getPriceAtPurchase())
                .build();
    }
}
