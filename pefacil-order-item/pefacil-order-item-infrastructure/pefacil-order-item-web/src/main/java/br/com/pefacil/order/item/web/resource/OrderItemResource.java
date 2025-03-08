package br.com.pefacil.order.item.web.resource;

import br.com.pefacil.order.item.web.facade.OrderItemFacade;
import br.com.pefacil.order.item.web.model.OrderItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/orderItem")
public class OrderItemResource {

    @Autowired
    private OrderItemFacade facade;

    @PostMapping
    ResponseEntity<OrderItemDTO> create(@RequestBody OrderItemDTO orderDTO) {
        return ResponseEntity.ok().body(this.facade.create(orderDTO));
    }
}
