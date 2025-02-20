package br.com.pefacil.stock.web.resource;

import br.com.pefacil.stock.web.facade.StockFacade;
import br.com.pefacil.stock.web.model.StockDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock")
public class StockResource {

    @Autowired
    private StockFacade facade;

    @PostMapping
    ResponseEntity<StockDTO> create(StockDTO stockDTO) {
        return ResponseEntity.ok().body(this.facade.create(stockDTO));
    }

    @GetMapping("/{id}")
    ResponseEntity<StockDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(this.facade.findById(id));
    }

    @PutMapping("/{id}")
    ResponseEntity<StockDTO> update(@PathVariable Integer id, @RequestBody StockDTO stockDTO) {
        return ResponseEntity.ok().body(this.facade.update(id, stockDTO));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        this.facade.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
