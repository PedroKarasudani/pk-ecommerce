package br.com.pefacil.user.domain.port.api.usecase;

import br.com.pefacil.user.domain.model.User;
import br.com.pefacil.user.domain.port.api.UpdateUser;
import br.com.pefacil.user.domain.port.spi.UserPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserUseCase implements UpdateUser {

    private UserPort port;

    @Override
    public User update(User user, Long id) {
        return this.port.update(user, id);
    }
}
