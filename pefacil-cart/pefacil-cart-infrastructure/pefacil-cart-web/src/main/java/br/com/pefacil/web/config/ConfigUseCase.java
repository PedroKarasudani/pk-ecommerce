package br.com.pefacil.web.config;

import br.com.pefacil.domain.port.api.CreateCart;
import br.com.pefacil.domain.port.api.DeleteCart;
import br.com.pefacil.domain.port.api.FindCart;
import br.com.pefacil.domain.port.api.UpdateCart;
import br.com.pefacil.domain.port.api.usecase.CreateCartUseCase;
import br.com.pefacil.domain.port.api.usecase.DeleteCartUseCase;
import br.com.pefacil.domain.port.api.usecase.FindCartUseCase;
import br.com.pefacil.domain.port.api.usecase.UpdateCartUseCase;
import br.com.pefacil.domain.port.spi.CartPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigUseCase {

    @Bean
    private CreateCart createCart(CartPort cartPort) {
        return new CreateCartUseCase(cartPort);
    }
    @Bean
    private FindCart findCart(CartPort cartPort) {
        return new FindCartUseCase(cartPort);
    }
    @Bean
    private UpdateCart UpdateCart(CartPort cartPort) {
        return new UpdateCartUseCase(cartPort);
    }
    @Bean
    private DeleteCart deleteCart(CartPort cartPort) {
        return new DeleteCartUseCase(cartPort);
    }
}
