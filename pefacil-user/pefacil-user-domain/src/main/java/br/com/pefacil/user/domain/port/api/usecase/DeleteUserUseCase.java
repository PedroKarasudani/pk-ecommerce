package br.com.pefacil.user.domain.port.api.usecase;

import br.com.pefacil.user.domain.port.api.DeleteUser;
import br.com.pefacil.user.domain.port.spi.UserPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DeleteUserUseCase implements DeleteUser {

    private UserPort port;

    @Override
    public void deleteById(Long id) {
        this.port.deleteById(id);
    }
}
