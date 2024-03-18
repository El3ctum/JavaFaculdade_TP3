package br.infnet.davivieira.tp3.model.service;

import br.infnet.davivieira.tp3.model.domain.User;
import br.infnet.davivieira.tp3.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void include(User user) {
        userRepository.save(user);
    }

    public void exclude(Integer id) {
        userRepository.deleteById(id);
    }

    public Collection<User> getList() {
        return (Collection<User>) userRepository.findAll();
    }

    public User get(Integer id){
        return userRepository.findById(id).orElse(null);
    }
}
