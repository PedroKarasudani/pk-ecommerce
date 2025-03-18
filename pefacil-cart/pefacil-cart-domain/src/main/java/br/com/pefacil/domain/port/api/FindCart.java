package br.com.pefacil.domain.port.api;

import br.com.pefacil.domain.model.Cart;

import java.util.Optional;

public interface FindCart {

    Optional<Cart> findById(Long id);

}
