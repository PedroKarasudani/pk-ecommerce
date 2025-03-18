package br.com.pefacil.persistence.model;

import br.com.pefacil.domain.model.Cart;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_carts")
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id")
    private List<OrderItem> items;

    public static CartEntity fromDomain(Cart cart , Long id){
        return CartEntity.builder()
                .id(id)
                .user(cart.getUser())
                .items(cart.getItems())
                .build();
    }

    public Cart toDomain(){
        return Cart.builder()
                .id(this.getId())
                .user(this.getUser())
                .items(this.getItems())
                .build();
    }
}
