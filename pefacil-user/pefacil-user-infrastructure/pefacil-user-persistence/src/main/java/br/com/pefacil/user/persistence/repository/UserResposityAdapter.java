package br.com.pefacil.user.persistence.repository;

import br.com.pefacil.user.domain.model.User;
import br.com.pefacil.user.domain.port.spi.UserPort;
import br.com.pefacil.user.persistence.model.UserEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserResposityAdapter implements UserPort {

    private final UserRepository userRepository;

    public UserResposityAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return this.userRepository.save(UserEntity.fromDomain(user, null)).toDomain();
    }

    @Override
    public Optional<User> findById(Long id) {
        return this.userRepository.findById(id).stream().map(UserEntity::toDomain).findFirst();
    }

    @Override
    public User update(User user, Long id) {
        return this.userRepository.save(UserEntity.fromDomain(user, id)).toDomain();
    }

    @Override
    public void deleteById(Long id) {
        this.userRepository.deleteById(id);
    }
}
