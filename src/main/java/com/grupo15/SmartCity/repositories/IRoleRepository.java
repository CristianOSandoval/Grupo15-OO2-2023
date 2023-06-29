package com.grupo15.SmartCity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo15.SmartCity.entities.Role;

public interface IRoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}