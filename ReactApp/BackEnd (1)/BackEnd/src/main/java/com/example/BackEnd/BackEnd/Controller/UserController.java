package com.example.BackEnd.BackEnd.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BackEnd.BackEnd.Entity.User;
import com.example.BackEnd.BackEnd.Service.UserService;

@RestController
@RequestMapping("/user")
// CrossOrigin is used to allow connection between front-end ans back-end
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    UserService services;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return services.saveUser(user);
    }

    @GetMapping("/get/{Id}")
    public User getUser(@PathVariable Long id) {
        return services.getUser(id);
    }

    @GetMapping("/getAll")
    public List<User> getUsers() {
        return services.getUsers();
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll() {
        return services.deleteAll();
    }

}
// Then Controller where we will be creating our endpoint that will help us to be able to connect with the front end