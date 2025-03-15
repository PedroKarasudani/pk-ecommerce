package br.com.pefacil.user.web.config;

import br.com.pefacil.user.domain.port.api.CreateUser;
import br.com.pefacil.user.domain.port.api.DeleteUser;
import br.com.pefacil.user.domain.port.api.FindUser;
import br.com.pefacil.user.domain.port.api.UpdateUser;
import br.com.pefacil.user.domain.port.api.usecase.CreateUserUseCase;
import br.com.pefacil.user.domain.port.api.usecase.DeleteUserUseCase;
import br.com.pefacil.user.domain.port.api.usecase.FindUserUseCase;
import br.com.pefacil.user.domain.port.api.usecase.UpdateUserUseCase;
import br.com.pefacil.user.domain.port.spi.UserPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CreateUser createUser(UserPort userPort) {
        return new CreateUserUseCase(userPort);
    }

    @Bean
    public FindUser findUser(UserPort userPort) {
        return new FindUserUseCase(userPort);
    }

    @Bean
    public UpdateUser updateUser(UserPort userPort) {
        return new UpdateUserUseCase(userPort);
    }

    @Bean
    public DeleteUser deleteUser(UserPort userPort) {
        return new DeleteUserUseCase(userPort);
    }
}
