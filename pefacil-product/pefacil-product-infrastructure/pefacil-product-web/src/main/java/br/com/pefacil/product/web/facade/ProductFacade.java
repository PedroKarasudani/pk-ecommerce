package br.com.pefacil.product.web.facade;

import br.com.pefacil.product.domain.port.api.CreateProduct;
import br.com.pefacil.product.domain.port.api.DeleteProduct;
import br.com.pefacil.product.domain.port.api.FindProduct;
import br.com.pefacil.product.domain.port.api.UpdateProduct;
import br.com.pefacil.product.web.converter.ProductConverter;
import br.com.pefacil.product.web.model.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductFacade {

    private final ProductConverter converter = new ProductConverter();

    @Autowired
    private CreateProduct createProduct;

    @Autowired
    private FindProduct findProduct;

    @Autowired
    private UpdateProduct updateProduct;

    @Autowired
    private DeleteProduct deleteProduct;

    public ProductDTO create(ProductDTO productDTO) {
        var product = this.converter.toDomain(productDTO);
        return this.converter.toDTO(this.createProduct.create(product));
    }

    public ProductDTO findById(Integer id) {
        return this.converter.toDTO(this.findProduct.findById(id));
    }

    public ProductDTO update(ProductDTO productDTO) {
        var product = converter.toDomain(productDTO);
        return this.converter.toDTO(this.updateProduct.update(product));
    }

    public void deleteById(Integer id) {
        this.deleteProduct.deleteById(id);
    }

}
