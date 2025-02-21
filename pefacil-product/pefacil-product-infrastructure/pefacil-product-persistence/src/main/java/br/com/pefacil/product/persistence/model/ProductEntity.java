package br.com.pefacil.product.persistence.model;

import br.com.pefacil.product.domain.model.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
@Builder
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double quantityStoke;
    private Double price;

    public static ProductEntity fromDomain(Product product) {
        return ProductEntity.builder()
                .name(product.getName())
                .description(product.getDescription())
                .quantityStoke(product.getQuantityStoke())
                .price(product.getPrice())
                .build();
    }
    
    public Product toDomain () {
        return Product.builder()
                .id(this.getId())
                .name(this.getName())
                .description(this.getDescription())
                .quantityStoke(this.getQuantityStoke())
                .price(getPrice())
                .build();
    }

}

