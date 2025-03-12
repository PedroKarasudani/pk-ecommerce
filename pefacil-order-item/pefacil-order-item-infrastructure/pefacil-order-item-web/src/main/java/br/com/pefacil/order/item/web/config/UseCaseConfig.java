package br.com.pefacil.order.item.web.config;

import br.com.pefacil.order.item.domain.port.api.CreateOrderItem;
import br.com.pefacil.order.item.domain.port.api.DeleteOrderItem;
import br.com.pefacil.order.item.domain.port.api.FindOrderItem;
import br.com.pefacil.order.item.domain.port.api.UpdateOderItem;
import br.com.pefacil.order.item.domain.port.api.usecase.CreateOrderItemUseCase;
import br.com.pefacil.order.item.domain.port.api.usecase.DeleteOrderItemUseCase;
import br.com.pefacil.order.item.domain.port.api.usecase.FindOrderItemUseCase;
import br.com.pefacil.order.item.domain.port.api.usecase.UpdateOrderItemUseCase;
import br.com.pefacil.order.item.domain.port.spi.OrderItemPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    private CreateOrderItem createOrderItem(OrderItemPort port) {
        return new CreateOrderItemUseCase(port);
    }

    @Bean
    private FindOrderItem findOrderItem(OrderItemPort port) { return new FindOrderItemUseCase(port); }

    @Bean
    private DeleteOrderItem deleteOrderItem(OrderItemPort port) { return new DeleteOrderItemUseCase(port); }

    @Bean
    private UpdateOderItem updateOderItem(OrderItemPort port) {return new UpdateOrderItemUseCase(port); }
}
