package br.com.pefacil.domain.port.api.usecase;

import br.com.pefacil.domain.model.Cart;
import br.com.pefacil.domain.port.api.CreateCart;
import br.com.pefacil.domain.port.spi.CartPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CreateCartUseCase implements CreateCart {

    private CartPort port;

    @Override
    public Cart create(Cart cart) {
        return this.port.create(cart);
    }
}
