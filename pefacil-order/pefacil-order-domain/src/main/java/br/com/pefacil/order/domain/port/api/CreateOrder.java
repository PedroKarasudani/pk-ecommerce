package br.com.pefacil.order.domain.port.api;

import br.com.pefacil.order.domain.model.Order;

import java.util.Optional;

public interface CreateOrder {

    Order create(Order order);
}
