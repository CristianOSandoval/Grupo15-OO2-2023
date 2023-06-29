package com.grupo15.SmartCity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo15.SmartCity.entities.User;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}