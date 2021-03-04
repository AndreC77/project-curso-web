package com.andrecoelho.webproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrecoelho.webproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
