package br.com.pefacil.stock.persistence.model;

import br.com.pefacil.stock.domain.model.Stock;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stock")
@Builder
public class StockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer qty;
    private Long associatedProduct;

    public static StockEntity fromDomain(Stock stock) {
        return StockEntity.builder()
                .qty(stock.getQty())
                .associatedProduct(stock.getAssociatedProduct())
                .build();
    }

    public Stock toDomain() {
        return Stock.builder()
                .id(this.id)
                .qty(this.getQty())
                .associatedProduct(this.getAssociatedProduct())
                .build();
    }

}
