package br.com.pefacil.user.web.facade;

import br.com.pefacil.user.domain.model.User;
import br.com.pefacil.user.domain.port.api.CreateUser;
import br.com.pefacil.user.domain.port.api.DeleteUser;
import br.com.pefacil.user.domain.port.api.FindUser;
import br.com.pefacil.user.domain.port.api.UpdateUser;
import br.com.pefacil.user.web.converter.UserConverter;
import br.com.pefacil.user.web.domain.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserFacade {

    private final UserConverter converter = new UserConverter();

    @Autowired
    private CreateUser createUser;

    @Autowired
    private FindUser findUser;

    @Autowired
    private UpdateUser updateUser;

    @Autowired
    private DeleteUser deleteUser;

    public UserDTO create(UserDTO userDTO) {
        return this.converter.toDTO(this.createUser.create(this.converter.toDomain(userDTO)));
    }

    public UserDTO findById(Long id) {
        return this.converter.toDTO(this.findUser.findById(id).get());
    }

    public UserDTO update(Long id, UserDTO userDTO) {
        return this.converter.toDTO(this.updateUser.update(this.converter.toDomain(userDTO), id));
    }

    public void delete(Long id) {
        this.deleteUser.deleteById(id);
    }

}
