package br.com.pefacil.stock.persistence;

import br.com.pefacil.stock.domain.model.Stock;
import br.com.pefacil.stock.domain.port.spi.StockPort;

public class StockRepository  implements StockPort {

    @Override
    public Stock create(Stock stock) {
        return null;
    }

    @Override
    public Stock findById(Integer id) {
        return null;
    }

    @Override
    public Stock update(Stock stock) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
