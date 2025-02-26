package br.com.pefacil.product.web.resource;

import java.lang.reflect.Array;
import java.util.Arrays;
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
    ResponseEntity<ProductDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(this.facade.findById(id));
    }

    @PutMapping("/{id}")
    ResponseEntity<ProductDTO> update(@PathVariable Integer id, @RequestBody ProductDTO productDTO){
        return ResponseEntity.ok().body(this.facade.update(productDTO, id));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Integer id) {
        this.facade.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
