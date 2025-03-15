package br.com.pefacil.user.domain.port.api.usecase;

import br.com.pefacil.user.domain.model.User;
import br.com.pefacil.user.domain.port.api.CreateUser;
import br.com.pefacil.user.domain.port.spi.UserPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CreateUserUseCase implements CreateUser {

    private UserPort port;

    @Override
    public User create(User user) {
        return this.port.create(user);
    }
}
