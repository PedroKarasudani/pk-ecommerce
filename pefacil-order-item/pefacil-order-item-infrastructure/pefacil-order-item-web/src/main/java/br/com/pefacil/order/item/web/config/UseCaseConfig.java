package br.com.pefacil.order.item.web.config;

import br.com.pefacil.order.item.domain.port.api.CreateOrderItem;
import br.com.pefacil.order.item.domain.port.api.usecase.CreateOrderItemUseCase;
import br.com.pefacil.order.item.domain.port.spi.OrderItemPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    private CreateOrderItem createOrderItem(OrderItemPort port) {
        return new CreateOrderItemUseCase(port);
    }
}
