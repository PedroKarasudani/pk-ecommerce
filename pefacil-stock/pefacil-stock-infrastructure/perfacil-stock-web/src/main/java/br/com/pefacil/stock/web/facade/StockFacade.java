package br.com.pefacil.stock.web.facade;

import br.com.pefacil.stock.domain.port.api.CreateStock;
import br.com.pefacil.stock.domain.port.api.DeleteStock;
import br.com.pefacil.stock.domain.port.api.FindStock;
import br.com.pefacil.stock.domain.port.api.UpdateStock;
import br.com.pefacil.stock.web.converter.StockConverter;
import br.com.pefacil.stock.web.model.StockDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockFacade {

    private final StockConverter converter = new StockConverter();

    @Autowired
    private CreateStock createStock;

    @Autowired
    private FindStock findStock;

    @Autowired
    private UpdateStock updateStock;

    @Autowired
    private DeleteStock deleteStock;

    public StockDTO create(StockDTO stockDTO) {
        var stock = this.converter.toDomain(stockDTO);
        return this.converter.toDTO(this.createStock.create(stock));
    }

    public StockDTO findById(Integer id) {
        return null;
    }

    public StockDTO update(Integer id, StockDTO stockDTO) {
        return null;
    }

    public void deleteById(Integer id) {

    }

}
