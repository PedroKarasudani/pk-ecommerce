package br.com.pefacil.stock.web.converter;

import br.com.pefacil.stock.domain.model.Stock;
import br.com.pefacil.stock.web.model.StockDTO;

public class StockConverter {

    public Stock toDomain(StockDTO stockDTO) {
        return new Stock();
    }

    public StockDTO toDTO(Stock stock) {
        return new StockDTO();
    }

}
