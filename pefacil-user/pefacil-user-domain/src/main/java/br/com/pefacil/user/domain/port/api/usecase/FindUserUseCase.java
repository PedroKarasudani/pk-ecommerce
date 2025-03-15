package br.com.pefacil.user.domain.port.api.usecase;

import br.com.pefacil.user.domain.exceptions.UserNotFoundException;
import br.com.pefacil.user.domain.model.User;
import br.com.pefacil.user.domain.port.api.FindUser;
import br.com.pefacil.user.domain.port.spi.UserPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class FindUserUseCase implements FindUser {

    private UserPort port;

    @Override
    public Optional<User> findById(Long id) {
        return Optional.of(this.port.findById(id).orElseThrow(() -> new UserNotFoundException(id)));
    }
}
