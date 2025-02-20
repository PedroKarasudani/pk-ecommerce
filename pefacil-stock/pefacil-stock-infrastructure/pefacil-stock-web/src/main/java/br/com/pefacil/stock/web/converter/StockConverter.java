package br.com.pefacil.stock.web.converter;

import br.com.pefacil.stock.domain.model.Stock;
import br.com.pefacil.stock.web.model.StockDTO;

public class StockConverter {

    public Stock toDomain(StockDTO stockDTO) {
        return Stock.builder()
                .id(stockDTO.getId())
                .qty(stockDTO.getQty())
                .associatedProduct(stockDTO.getAssociatedProduct())
                .build();
    }

    public StockDTO toDTO(Stock stock) {
        return StockDTO.builder()
                .id(stock.getId())
                .qty(stock.getQty())
                .associatedProduct(stock.getAssociatedProduct())
                .build();
    }

}
