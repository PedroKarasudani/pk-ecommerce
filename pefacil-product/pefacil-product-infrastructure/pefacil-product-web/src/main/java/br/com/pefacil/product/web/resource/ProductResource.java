package br.com.pefacil.product.web.resource;

import java.util.List;

import br.com.pefacil.product.web.facade.ProductFacade;
import br.com.pefacil.product.web.model.ProductDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductResource {

    @Autowired
    private ProductFacade facade;

    @PostMapping
    ResponseEntity<ProductDTO> create(@RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok().body(this.facade.create(productDTO));
    }

    @GetMapping
    ResponseEntity<List<ProductDTO>> findAll(){
        return ResponseEntity.ok().body(this.facade.findAll());
    }

    @GetMapping("/{id}")
    ResponseEntity<ProductDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.findById(id));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<ProductDTO> findByName(@PathVariable String name) {
        return ResponseEntity.ok().body(this.facade.findByName(name));
    }

    @PutMapping("/{id}")
    ResponseEntity<ProductDTO> update(@PathVariable Long id, @RequestBody ProductDTO productDTO){
        return ResponseEntity.ok().body(this.facade.update(productDTO, id));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id) {
        this.facade.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
