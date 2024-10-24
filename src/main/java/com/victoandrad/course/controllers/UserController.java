package com.victoandrad.course.controllers;

import com.victoandrad.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Victor Andrade", "victor@gmail.com", "43991172893", "1233456");
        return ResponseEntity.ok().body(user);

    }
}
