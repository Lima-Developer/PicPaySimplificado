package com.picpaysimplificado.picpaysimplificado.domain.user;

import com.picpaysimplificado.picpaysimplificado.dtos.UserDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

//Como a classe representa uma entidade utilizamos a anotação '@Entity' para representar essa classe como uma entidade no banco de dados
@Entity(name="users")
//A anotação Table informa o nome da tabela que a entididade está representando
@Table(name="users")
//Lombok --> 'Facilitador' de métodos comuns
@Getter //Criação dos Getters
@Setter //Criação dos Setters
@AllArgsConstructor //Criação de um constructor que receba todos os argumentos
@NoArgsConstructor
@EqualsAndHashCode(of="id") //Chave primária da entidade, da tabela
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @Column(unique = true) //Identificar que a Coluna document não pode ter repetição
    private String document;

    @Column(unique = true)
    private String email;

    private String password;

    private BigDecimal balance; //Decimal grande - O saldo do Usuário

    @Enumerated(EnumType.STRING) //Armazena o valo da enumeração em STRING
    private UserType userType;

    public User(UserDTO data){
        this.firstName = data.firstName();
        this.lastName = data.lastName();
        this.balance = data.balance();
        this.userType = data.userType();
        this.password = data.password();
        this.document = data.document();
        this.email = data.email();
    }

}
