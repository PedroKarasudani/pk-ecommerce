package br.com.pefacil.domain.port.api.usecase;

import br.com.pefacil.domain.model.Cart;
import br.com.pefacil.domain.port.api.FindCart;
import br.com.pefacil.domain.port.spi.CartPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class FindCartUseCase implements FindCart {

    private CartPort port;

    @Override
    public Optional<Cart> findById(Long id) {
        return this.port.findById(id);
    }
}
