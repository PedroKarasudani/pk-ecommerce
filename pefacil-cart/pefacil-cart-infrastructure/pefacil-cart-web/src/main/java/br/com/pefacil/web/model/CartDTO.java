package br.com.pefacil.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CartDTO {
    private Long id;
    private User user;
    private List<OrderItem> items;
}

