package com.jeeplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeeplus.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
    User findByUsername(String username);

}
