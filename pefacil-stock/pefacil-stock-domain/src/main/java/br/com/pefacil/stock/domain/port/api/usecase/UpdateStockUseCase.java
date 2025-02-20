package br.com.pefacil.stock.domain.port.api.usecase;

import br.com.pefacil.stock.domain.model.Stock;
import br.com.pefacil.stock.domain.port.api.UpdateStock;
import br.com.pefacil.stock.domain.port.spi.StockPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UpdateStockUseCase implements UpdateStock {

    private StockPort stockPort;

    @Override
    public Stock update(Stock stock) {
        return null;
    }
}
