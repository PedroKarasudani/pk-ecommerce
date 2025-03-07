package br.com.pefacil.order.web.config;

import br.com.pefacil.order.domain.port.api.CreateOrder;
import br.com.pefacil.order.domain.port.api.DeleteOrder;
import br.com.pefacil.order.domain.port.api.FindOrder;
import br.com.pefacil.order.domain.port.api.UpdateOrder;
import br.com.pefacil.order.domain.port.api.usecase.CreateOrderUseCase;
import br.com.pefacil.order.domain.port.api.usecase.DeleteOrderUseCase;
import br.com.pefacil.order.domain.port.api.usecase.FindOrderUserCase;
import br.com.pefacil.order.domain.port.api.usecase.UpdateOrderUseCase;
import br.com.pefacil.order.domain.port.spi.OrderPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CreateOrder createOrder (OrderPort orderPort){
        return new CreateOrderUseCase(orderPort);
    }

    @Bean
    public UpdateOrder updateOrder (OrderPort orderPort){
        return new UpdateOrderUseCase(orderPort);
    }

    @Bean
    public DeleteOrder deleteOrder (OrderPort orderPort){
        return new DeleteOrderUseCase(orderPort);
    }

    @Bean
    public FindOrder findOrder (OrderPort orderPort){
        return new FindOrderUserCase(orderPort);
    }


}
