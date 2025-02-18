package br.com.pefacil.product.web.converter;

import br.com.pefacil.product.domain.model.Product;
import br.com.pefacil.product.web.model.ProductDTO;

public class ProductConverter {

    public Product toDomain(ProductDTO productDTO) {
        return new Product();
    };

    public ProductDTO toDTO(Product product) {
        return new ProductDTO();
    }
}
