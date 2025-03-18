package br.com.pefacil.domain.port.api;

import br.com.pefacil.domain.model.Cart;

public interface UpdateCart {

    Cart update(Long id, Cart cart);
}
