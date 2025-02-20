package br.com.pefacil.stock.domain.port.api.usecase;

import br.com.pefacil.stock.domain.port.api.DeleteStock;
import br.com.pefacil.stock.domain.port.spi.StockPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DeleteStockUseCase implements DeleteStock {

    private StockPort stockPort;

    @Override
    public void deleteById(Integer id) {

    }
}
