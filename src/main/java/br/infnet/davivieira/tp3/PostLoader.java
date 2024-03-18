package br.infnet.davivieira.tp3;

import br.infnet.davivieira.tp3.model.domain.Post;
import br.infnet.davivieira.tp3.model.domain.User;
import br.infnet.davivieira.tp3.model.service.PostService;
import br.infnet.davivieira.tp3.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PostLoader implements ApplicationRunner {

    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Post postagem = postService.getPostById(1);

        postService.include(postagem);

        postService.exclude(1);

        User usuario = new User();
        usuario.setNickName("Davi");
        usuario.setEmail("testando@gmail.com");
        usuario.setBirthday("2000/01/01");

        Post newPost = new Post();
        newPost.setTitle("AAPP");
        newPost.setContent("LALALALALALAL");
        newPost.setUser(usuario);

        postService.include(newPost);

        System.out.println(" - " + postService.getPostById(2));
    }
}
