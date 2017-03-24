package com.jeeplus.repository;

import com.jeeplus.model.OAuthUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<OAuthUser, Integer> {

    OAuthUser findByUsername(String username);

}
