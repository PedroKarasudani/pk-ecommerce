package br.com.pefacil.stock.domain.port.spi;

import br.com.pefacil.stock.domain.model.Stock;

public interface StockPort {

    Stock create(Stock stock);

    Stock findById(Integer id);

    Stock update(Stock stock);

    void deleteById(Integer id);


}
