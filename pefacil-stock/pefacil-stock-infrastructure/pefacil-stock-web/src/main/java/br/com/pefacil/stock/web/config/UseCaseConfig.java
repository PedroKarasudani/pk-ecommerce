package br.com.pefacil.stock.web.config;

import br.com.pefacil.stock.domain.port.api.CreateStock;
import br.com.pefacil.stock.domain.port.api.DeleteStock;
import br.com.pefacil.stock.domain.port.api.FindStock;
import br.com.pefacil.stock.domain.port.api.UpdateStock;
import br.com.pefacil.stock.domain.port.api.usecase.CreateStockUseCase;
import br.com.pefacil.stock.domain.port.api.usecase.DeleteStockUseCase;
import br.com.pefacil.stock.domain.port.api.usecase.FindStockUseCase;
import br.com.pefacil.stock.domain.port.api.usecase.UpdateStockUseCase;
import br.com.pefacil.stock.domain.port.spi.StockPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CreateStock createStock(StockPort stockPort) {
        return new CreateStockUseCase(stockPort);
    }

    @Bean
    public FindStock findStock(StockPort stockPort) {
        return new FindStockUseCase(stockPort);
    }

    @Bean
    public UpdateStock updateStock(StockPort stockPort) {
        return new UpdateStockUseCase(stockPort);
    }

    @Bean
    public DeleteStock deleteStock(StockPort stockPort) {
        return new DeleteStockUseCase(stockPort);
    }

}
