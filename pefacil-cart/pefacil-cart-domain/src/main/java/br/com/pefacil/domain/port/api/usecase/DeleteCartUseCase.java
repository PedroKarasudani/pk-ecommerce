package br.com.pefacil.domain.port.api.usecase;

import br.com.pefacil.domain.port.api.DeleteCart;
import br.com.pefacil.domain.port.spi.CartPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DeleteCartUseCase implements DeleteCart {

    private CartPort port;

    @Override
    public void deleteById(Long id) {
        this.port.deleteById(id);
    }
}
