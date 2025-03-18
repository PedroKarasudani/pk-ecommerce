package br.com.pefacil.domain.port.spi;

import br.com.pefacil.domain.model.Cart;

import java.util.Optional;

public interface CartPort {

    Cart create(Cart cart);

    Optional<Cart> findById(Long id);

    Cart update(Long id, Cart cart);

    void deleteById(Long id);

}
