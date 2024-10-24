package com.victoandrad.course.services;

import com.victoandrad.course.entities.User;
import com.victoandrad.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);

        // O objeto Optional representa um valor que pode ou não estar presente
        // então se tentarmos procurar um user inexistente, o metodo get irá lançar uma exceção

        return obj.get();
    }
}