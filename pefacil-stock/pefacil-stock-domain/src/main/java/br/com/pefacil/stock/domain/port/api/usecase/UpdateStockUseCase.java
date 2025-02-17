package br.com.pefacil.stock.domain.port.api.usecase;

import br.com.pefacil.stock.domain.model.Stock;
import br.com.pefacil.stock.domain.port.api.UpdateStock;
import br.com.pefacil.stock.domain.port.api.model.UpdateStockCommand;

public class UpdateStockUseCase implements UpdateStock {
    @Override
    public Stock update(UpdateStockCommand command) {
        return null;
    }
}
