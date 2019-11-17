package com.codedesigner.basicauthspringboot.controllers;

import com.codedesigner.basicauthspringboot.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping(value = "/", produces = "application/json")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("michal",
                "bliznak",
                "doubravy 202",
                "michal.bliznak@gmail.com"));
        return users;
    }
}
