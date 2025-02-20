package br.com.pefacil.stock.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stock {

    private Long id;
    private Integer qty;
    private Long associatedProduct;

}
