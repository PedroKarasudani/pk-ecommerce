package br.com.pefacil.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Cart {

    private Long id;
    private User user;
    private List<OrderItem> items;

}

