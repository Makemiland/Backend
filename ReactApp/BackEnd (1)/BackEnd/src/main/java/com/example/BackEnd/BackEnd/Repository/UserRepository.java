package com.example.BackEnd.BackEnd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BackEnd.BackEnd.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
// Repository that will be extending our JapRepo to so that we can have the JPA functions that have our SQL commands.
