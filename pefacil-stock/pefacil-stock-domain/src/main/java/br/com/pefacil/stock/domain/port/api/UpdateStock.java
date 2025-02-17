package br.com.pefacil.stock.domain.port.api;

import br.com.pefacil.stock.domain.model.Stock;
import br.com.pefacil.stock.domain.port.api.model.UpdateStockCommand;

public interface UpdateStock {

    Stock update(UpdateStockCommand command);

}
