package br.com.pefacil.user.web.domain;

import br.com.pefacil.user.domain.model.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@Builder
public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String cpf;
    private Address address;
    private String phone;
    private String password;
    private LocalDate birthDate;
    private List<Order> orders;
    private Cart cart;

}
