package br.com.pefacil.user.domain.port.api;

import br.com.pefacil.user.domain.model.User;

import java.util.Optional;

public interface FindUser {

    Optional<User> findById(Long id);
}
