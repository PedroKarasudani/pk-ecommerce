package br.com.pefacil.order.persistence.model;

import br.com.pefacil.order.domain.model.Order;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_orders")
@Builder
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;

    private LocalDateTime orderDate;


    public static OrderEntity fromDomain(Order order, Long id){
        return OrderEntity.builder()
                .id(id)
                .user(order.getUser())
                .orderItems(order.getOrderItems())
                .orderDate(order.getOrderDate())
                .payment(order.getPayment())
                .build();
    }

    public Order toDomain(){
        return Order.builder()
                .id(this.getId())
                .user(this.getUser())
                .orderItems(this.getOrderItems())
                .orderDate(this.getOrderDate())
                .payment(this.getPayment())
                .build();
    }
}