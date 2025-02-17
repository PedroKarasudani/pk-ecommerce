package br.com.pefacil.stock.domain.port.api;

import br.com.pefacil.stock.domain.model.Stock;
import br.com.pefacil.stock.domain.port.api.model.CreateStockCommand;

public interface CreateStock {

    Stock create(CreateStockCommand command);

}
