package com.example.BackEnd.BackEnd.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BackEnd.BackEnd.Entity.User;
import com.example.BackEnd.BackEnd.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository Repository;

    public User saveUser(User user) {
        return Repository.save(user);
    }

    public User getUser(Long id) {
        return Repository.findById(id).get();
    }

    public List<User> getUsers() {
        return Repository.findAll();

    }

    public String deleteAll() {
        Repository.deleteAll();
        return ("Data deleted");
    }

}
// Services where we will be creating the functionality of the application using those functions from our JPA.