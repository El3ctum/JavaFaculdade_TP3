package br.infnet.davivieira.tp3.model.repository;

import br.infnet.davivieira.tp3.model.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

}
