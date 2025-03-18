package br.com.pefacil.web.resources;

import br.com.pefacil.web.facade.CartFacade;
import br.com.pefacil.web.model.CartDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartResource {

    @Autowired
    private CartFacade facade;

    @PostMapping
    ResponseEntity<CartDTO> create(@RequestBody CartDTO cartDTO) {
        return ResponseEntity.ok().body(this.facade.create(cartDTO));
    }

    @GetMapping("/${id}")
    ResponseEntity<CartDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.findById(id));
    }

    @PutMapping("/{id}")
    ResponseEntity<CartDTO> create(@PathVariable Long id, @RequestBody CartDTO cartDTO){
        return ResponseEntity.ok().body(this.facade.update(id, cartDTO));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteById(@PathVariable Long id) {
        this.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
