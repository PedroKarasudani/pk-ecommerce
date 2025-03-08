package br.com.pefacil.order.item.domain.port.api.usecase;

import br.com.pefacil.order.item.domain.model.OrderItem;
import br.com.pefacil.order.item.domain.port.api.FindOrderItem;

import java.util.Optional;

public class FindOrderItemUseCase implements FindOrderItem {

    @Override
    public Optional<OrderItem> findById(Long id) {
        return null;
    }
}
