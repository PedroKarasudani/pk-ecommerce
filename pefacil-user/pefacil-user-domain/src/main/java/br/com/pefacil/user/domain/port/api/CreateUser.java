package br.com.pefacil.user.domain.port.api;

import br.com.pefacil.user.domain.model.User;

public interface CreateUser {

    User create(User user);
}
