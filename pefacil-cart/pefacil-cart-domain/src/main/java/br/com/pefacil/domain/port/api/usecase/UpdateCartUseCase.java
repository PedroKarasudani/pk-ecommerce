package br.com.pefacil.domain.port.api.usecase;

import br.com.pefacil.domain.model.Cart;
import br.com.pefacil.domain.port.api.UpdateCart;
import br.com.pefacil.domain.port.spi.CartPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UpdateCartUseCase implements UpdateCart {

    private CartPort port;

    @Override
    public Cart update(Long id, Cart cart) {
        return this.port.update(id, cart);
    }
}
