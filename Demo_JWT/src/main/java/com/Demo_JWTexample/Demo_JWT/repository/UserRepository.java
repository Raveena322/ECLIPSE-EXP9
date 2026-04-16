package com.Demo_JWTexample.Demo_JWT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Demo_JWTexample.Demo_JWT.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}