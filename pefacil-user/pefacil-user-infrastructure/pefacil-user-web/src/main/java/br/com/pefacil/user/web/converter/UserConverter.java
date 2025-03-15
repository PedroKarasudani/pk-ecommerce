package br.com.pefacil.user.web.converter;

import br.com.pefacil.user.domain.model.User;
import br.com.pefacil.user.web.domain.UserDTO;


public class UserConverter {

    public User toDomain (UserDTO userDTO){
        return User.builder()
                .id(userDTO.getId())
                .name(userDTO.getName())
                .email(userDTO.getEmail())
                .cpf(userDTO.getCpf())
                .address(userDTO.getAddress())
                .phone(userDTO.getPhone())
                .password(userDTO.getPassword())
                .birthDate(userDTO.getBirthDate())
                .orders(userDTO.getOrders())
                .cart(userDTO.getCart())
                .build();
    }

    public UserDTO toDTO (User user){
        return UserDTO.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .cpf(user.getCpf())
                .address(user.getAddress())
                .phone(user.getPhone())
                .password(user.getPassword())
                .birthDate(user.getBirthDate())
                .orders(user.getOrders())
                .cart(user.getCart())
                .build();
    }

}
