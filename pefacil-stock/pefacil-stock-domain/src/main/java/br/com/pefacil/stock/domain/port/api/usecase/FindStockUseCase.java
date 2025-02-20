package br.com.pefacil.stock.domain.port.api.usecase;

import br.com.pefacil.stock.domain.model.Stock;
import br.com.pefacil.stock.domain.port.api.FindStock;
import br.com.pefacil.stock.domain.port.spi.StockPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class FindStockUseCase implements FindStock {

    private StockPort stockPort;

    @Override
    public Stock findById(Integer id) {
        return null;
    }
}
