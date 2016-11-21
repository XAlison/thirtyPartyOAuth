package com.jeeplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeeplus.model.OAuthUser;

public interface OauthUserRepository extends JpaRepository<OAuthUser, Integer> {
    
    OAuthUser findByOAuthTypeAndOAuthId(String oAuthType, String oAuthId);

}
