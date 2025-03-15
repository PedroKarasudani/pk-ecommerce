package br.com.pefacil.user.persistence.model;

import br.com.pefacil.user.domain.model.Address;
import br.com.pefacil.user.domain.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "tb_users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String cpf;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Address address;

    private String phone;

    private String password;

    private LocalDate birthDate;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Order> orders;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Cart cart;

    public static UserEntity fromDomain (User user, Long id) {
        return UserEntity.builder()
                .id(id)
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

    public User toDomain () {
        return User.builder()
                .id(this.getId())
                .name(this.getName())
                .email(this.getEmail())
                .cpf(this.getCpf())
                .address(this.getAddress())
                .phone(this.getPhone())
                .password(this.getPassword())
                .birthDate(this.getBirthDate())
                .orders(this.getOrders())
                .cart(this.getCart())
                .build();
    }
}

