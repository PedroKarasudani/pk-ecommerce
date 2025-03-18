package br.com.pefacil.persistence.repository;

import br.com.pefacil.domain.model.Cart;
import br.com.pefacil.domain.port.spi.CartPort;
import br.com.pefacil.persistence.model.CartEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CartRepositoryAdapter implements CartPort {

    private final CartRepository cartRepository;

    public CartRepositoryAdapter(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public Cart create(Cart cart) {
        return this.cartRepository.save(CartEntity.fromDomain(cart, null)).toDomain();
    }

    @Override
    public Optional<Cart> findById(Long id) {
        return this.cartRepository.findById(id).stream().map(CartEntity::toDomain).findFirst();
    }

    @Override
    public Cart update(Long id, Cart cart) {
        return this.cartRepository.save(CartEntity.fromDomain(cart, id)).toDomain();
    }

    @Override
    public void deleteById(Long id) {
        this.cartRepository.deleteById(id);
    }
}
