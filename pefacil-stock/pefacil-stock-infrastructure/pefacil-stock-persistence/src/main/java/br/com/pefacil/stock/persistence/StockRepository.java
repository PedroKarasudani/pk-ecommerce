package br.com.pefacil.stock.persistence;

import br.com.pefacil.stock.domain.exceptions.StockNotFoundException;
import br.com.pefacil.stock.domain.model.Stock;
import br.com.pefacil.stock.domain.port.spi.StockPort;
import br.com.pefacil.stock.persistence.model.StockEntity;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class StockRepository implements StockPort {

    private final Map<Long, StockEntity> stockMap = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    @Override
    public Stock create(Stock stock) {
        Long id = idGenerator.getAndIncrement();
        StockEntity entity = StockEntity.fromDomain(stock);
        stockMap.put(id, entity);
        return entity.toDomain();
    }

    @Override
    public Stock findById(Integer id) {
        StockEntity entity = stockMap.get(id.longValue());
        if (entity != null) {
            return entity.toDomain();
        }
        throw new StockNotFoundException("Stock with id" + id.longValue() + " was not found");
    }

    @Override
    public Stock update(Stock stock) {
        if (stock.getId() == null || !stockMap.containsKey(stock.getId())) {
            throw new StockNotFoundException("Stock not found");
        }
        StockEntity entity = StockEntity.fromDomain(stock);
        stockMap.put(stock.getId(), entity);
        return entity.toDomain();
    }

    @Override
    public void deleteById(Integer id) {
        stockMap.remove(id.longValue());
    }

}

