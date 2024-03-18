package br.infnet.davivieira.tp3.clients;

import br.infnet.davivieira.tp3.model.domain.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

@FeignClient(url = "https://jsonplaceholder.typicode.com", name = "postClient")
public interface IPostClient {

    @GetMapping(value = "/posts")
    Collection<Post> getAllPosts();

    @GetMapping(value = "/posts/{id}")
    Post getPost(@PathVariable Integer id);
}
