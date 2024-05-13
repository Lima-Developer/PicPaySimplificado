package com.picpaysimplificado.picpaysimplificado.repositories;

import com.picpaysimplificado.picpaysimplificado.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    //O Tipo de retorno 'Optional' informa que pode ser que retorne um tipo de usuário ou não, pois neste caso por exemplo, estamos verificando por meio do documento se o usuário está cadastrado na minha tabela ou não, então ele pode retornar um usuário ou não
    Optional<User> findUserByDocument(String document); //JPA ja cria a query em runtime de acordo com a declaração sintática do método "findUserByDocument"
    Optional<User> findUserById(Long id);


}
