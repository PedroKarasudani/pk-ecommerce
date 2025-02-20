package br.com.pefacil.product.web.config;

import br.com.pefacil.product.domain.port.api.CreateProduct;
import br.com.pefacil.product.domain.port.api.DeleteProduct;
import br.com.pefacil.product.domain.port.api.FindProduct;
import br.com.pefacil.product.domain.port.api.UpdateProduct;
import br.com.pefacil.product.domain.port.api.usecase.CreateProductUseCase;
import br.com.pefacil.product.domain.port.api.usecase.DeleteProductUseCase;
import br.com.pefacil.product.domain.port.api.usecase.FindProductUseCase;
import br.com.pefacil.product.domain.port.api.usecase.UpdateProductUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CreateProduct createProduct() {
        return new CreateProductUseCase();
    }

    @Bean
    public FindProduct findProduct() {
        return new FindProductUseCase();
    }

    @Bean
    public UpdateProduct updateProduct() {
        return new UpdateProductUseCase();
    }

    @Bean
    public DeleteProduct deleteProduct() {
        return new DeleteProductUseCase();
    }
}
