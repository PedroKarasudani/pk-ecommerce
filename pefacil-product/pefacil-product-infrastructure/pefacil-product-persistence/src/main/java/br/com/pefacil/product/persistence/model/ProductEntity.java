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
@Table(name = "tb_products")
@Builder
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double stockQuantity;
    private Double price;

    public static ProductEntity fromDomain(Product product) {
        return ProductEntity.builder()
                .name(product.getName())
                .description(product.getDescription())
                .stockQuantity(product.getStockQuantity())
                .price(product.getPrice())
                .build();
    }

    public static ProductEntity fromDomain(Product product, Long id) {
        return ProductEntity.builder()
                .id(id)
                .name(product.getName())
                .description(product.getDescription())
                .stockQuantity(product.getStockQuantity())
                .price(product.getPrice())
                .build();
    }
    
    public Product toDomain () {
        return Product.builder()
                .id(this.getId())
                .name(this.getName())
                .description(this.getDescription())
                .stockQuantity(this.getStockQuantity())
                .price(getPrice())
                .build();
    }

}

