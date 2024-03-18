package br.infnet.davivieira.tp3.model.repository;

import br.infnet.davivieira.tp3.model.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
