package br.com.pefacil.product.web.config;

import br.com.pefacil.product.domain.port.api.CreateProduct;
import br.com.pefacil.product.domain.port.api.DeleteProduct;
import br.com.pefacil.product.domain.port.api.FindProduct;
import br.com.pefacil.product.domain.port.api.UpdateProduct;
import br.com.pefacil.product.domain.port.api.usecase.CreateProductUseCase;
import br.com.pefacil.product.domain.port.api.usecase.DeleteProductUseCase;
import br.com.pefacil.product.domain.port.api.usecase.FindProductUseCase;
import br.com.pefacil.product.domain.port.api.usecase.UpdateProductUseCase;
import br.com.pefacil.product.domain.port.spi.ProductPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CreateProduct createProduct(ProductPort productPort) {
        return new CreateProductUseCase(productPort);
    }

    @Bean
    public FindProduct findProduct(ProductPort productPort) {
        return new FindProductUseCase(productPort);
    }

    @Bean
    public UpdateProduct updateProduct(ProductPort productPort) {
        return new UpdateProductUseCase(productPort);
    }

    @Bean
    public DeleteProduct deleteProduct(ProductPort productPort) {
        return new DeleteProductUseCase(productPort);
    }
}
