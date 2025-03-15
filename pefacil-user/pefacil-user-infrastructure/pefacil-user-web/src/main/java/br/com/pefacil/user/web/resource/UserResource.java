package br.com.pefacil.user.web.resource;

import br.com.pefacil.user.web.domain.UserDTO;
import br.com.pefacil.user.web.facade.UserFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserResource {

    private UserFacade facade;

    @PostMapping
    ResponseEntity<UserDTO> create(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body(this.facade.create(userDTO));
    }

    @GetMapping("/{id}")
    ResponseEntity<UserDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(this.facade.findById(id));
    }

    @PutMapping("/{id")
    ResponseEntity<UserDTO> update(@PathVariable Long id, @RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body(this.facade.update(id, userDTO));
    }

    @DeleteMapping("/{id")
    ResponseEntity<Void> deleteById(@PathVariable Long id) {
        this.facade.delete(id);
        return ResponseEntity.noContent().build();
    }
}
