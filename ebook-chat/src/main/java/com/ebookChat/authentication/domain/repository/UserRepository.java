package com.ebookChat.authentication.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebookChat.authentication.domain.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
