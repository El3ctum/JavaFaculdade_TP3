package br.infnet.davivieira.tp3.controller;

import br.infnet.davivieira.tp3.model.domain.Post;
import br.infnet.davivieira.tp3.model.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping(value = "/post")
    public void include(@RequestBody Post post) {
        postService.include(post);
    }

    @GetMapping(value = "/{id}")
    public Post getById(@PathVariable Integer id) {
        return postService.getPostById(id);
    }

    @GetMapping(value = "/post")
    public Collection<Post> getAllPosts(){
        return postService.getAllPosts();
    }
}
