package br.com.pefacil.stock.domain.port.api.usecase;

import br.com.pefacil.stock.domain.model.Stock;
import br.com.pefacil.stock.domain.port.api.CreateStock;
import br.com.pefacil.stock.domain.port.spi.StockPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CreateStockUseCase implements CreateStock {

    private StockPort stockPort;

    @Override
    public Stock create(Stock stock) {
        return this.stockPort.create(stock);
    }
}
