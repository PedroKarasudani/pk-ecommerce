package br.com.pefacil.user.web.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class AddressDTO {

    private Long id;
    private String street;
    private Integer number;
    private String neighborhood;
    private String complement;
    private String cep;
    private String reference;
    private UserDTO user;
}