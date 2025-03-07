package br.com.pefacil.order.web.resource;

import br.com.pefacil.order.domain.model.Order;
import br.com.pefacil.order.web.facade.OrderFacade;
import br.com.pefacil.order.web.model.OrderDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderResource {

    private OrderFacade facade;

    @PostMapping
    ResponseEntity<OrderDTO> create(@RequestBody OrderDTO orderDTO){
        return ResponseEntity.ok().body(this.facade.create(orderDTO));
    }

    @GetMapping("/{id}")
    ResponseEntity<OrderDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.findById(id));
    }

    @PutMapping("/{id}")
    ResponseEntity<OrderDTO> update(@RequestBody OrderDTO orderDTO, @PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.update(orderDTO, id));
    }
    
    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteById(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}
