package br.com.pefacil.product.web.converter;

import java.util.List;
import java.util.stream.Collectors;

import br.com.pefacil.product.domain.model.Product;
import br.com.pefacil.product.web.model.ProductDTO;

public class ProductConverter {

    public Product toDomain(ProductDTO productDTO) {
        return Product.builder()
                .id(productDTO.getId())
                .name(productDTO.getName())
                .description(productDTO.getDescription())
                .quantityStoke(productDTO.getQuantityStoke())
                .price(productDTO.getPrice()).build();
    }

    public ProductDTO toDTO(Product product) {
        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .quantityStoke(product.getQuantityStoke())
                .price(product.getPrice()).build();
    }

    public List<ProductDTO> toDTO(List<Product> productList) {
        return productList.stream()
            .map(x -> ProductDTO.builder()
                .id(x.getId())
                .name(x.getName())
                .description(x.getDescription())
                .quantityStoke(x.getQuantityStoke())
                .price(x.getPrice())
                .build())
            .collect(Collectors.toList());
        }
}
