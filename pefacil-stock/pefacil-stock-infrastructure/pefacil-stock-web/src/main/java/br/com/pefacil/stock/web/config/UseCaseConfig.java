package br.com.pefacil.stock.web.config;

import br.com.pefacil.stock.domain.port.api.CreateStock;
import br.com.pefacil.stock.domain.port.api.DeleteStock;
import br.com.pefacil.stock.domain.port.api.FindStock;
import br.com.pefacil.stock.domain.port.api.UpdateStock;
import br.com.pefacil.stock.domain.port.api.usecase.CreateStockUseCase;
import br.com.pefacil.stock.domain.port.api.usecase.DeleteStockUseCase;
import br.com.pefacil.stock.domain.port.api.usecase.FindStockUseCase;
import br.com.pefacil.stock.domain.port.api.usecase.UpdateStockUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CreateStock createStock() {
        return new CreateStockUseCase();
    }

    @Bean
    public FindStock findStock() {
        return new FindStockUseCase();
    }

    @Bean
    public UpdateStock updateStock() {
        return new UpdateStockUseCase();
    }

    @Bean
    public DeleteStock deleteStock() {
        return new DeleteStockUseCase();
    }

}
