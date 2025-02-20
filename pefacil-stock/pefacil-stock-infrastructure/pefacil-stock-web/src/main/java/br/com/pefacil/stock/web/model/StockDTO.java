package br.com.pefacil.stock.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StockDTO {

    private Long id;
    private Integer qty;
    private Long associatedProduct;

}
