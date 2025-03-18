package br.com.pefacil.web.converter;

import br.com.pefacil.domain.model.Cart;
import br.com.pefacil.web.model.CartDTO;
import org.springframework.stereotype.Component;

@Component
public class CartConverter {

    public Cart toDomain(CartDTO cartDTO) {
        return Cart.builder()
                .id(cartDTO.getId())
                .user(cartDTO.getUser())
                .items(cartDTO.getItems())
                .build();
    }

    public CartDTO toDTO(Cart cart) {
        return CartDTO.builder()
                .id(cart.getId())
                .user(cart.getUser())
                .items(cart.getItems())
                .build();
    }
}
