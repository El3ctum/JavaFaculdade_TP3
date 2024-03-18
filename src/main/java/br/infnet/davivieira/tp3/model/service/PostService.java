package br.infnet.davivieira.tp3.model.service;

import br.infnet.davivieira.tp3.clients.IPostClient;
import br.infnet.davivieira.tp3.model.domain.Post;
import br.infnet.davivieira.tp3.model.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PostService {

    @Autowired
    private IPostClient postClient;

    @Autowired
    private PostRepository postRepository;

    public void include(Post post) {
        postRepository.save(post);
    }

    public void exclude(Integer id) {
        postRepository.deleteById(id);
    }

    public Post getPostById(Integer id) {
        // Prioritize local data (if available)
        Post localPost = postRepository.findById(id).orElse(null);
        if (localPost != null) {
            return localPost;
        } else {
            return postClient.getPost(id);  // Fetch from external API if not found locally
        }
    }

    public Collection<Post> getAllPosts() {
        return postClient.getAllPosts();
    }
}
