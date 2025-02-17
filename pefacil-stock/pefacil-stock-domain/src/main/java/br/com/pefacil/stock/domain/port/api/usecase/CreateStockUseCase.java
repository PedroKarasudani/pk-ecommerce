package br.com.pefacil.stock.domain.port.api.usecase;

import br.com.pefacil.stock.domain.model.Stock;
import br.com.pefacil.stock.domain.port.api.CreateStock;
import br.com.pefacil.stock.domain.port.api.model.CreateStockCommand;

public class CreateStockUseCase implements CreateStock {
    @Override
    public Stock create(CreateStockCommand command) {
        return null;
    }
}
