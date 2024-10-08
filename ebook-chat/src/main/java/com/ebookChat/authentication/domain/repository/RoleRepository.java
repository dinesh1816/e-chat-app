package com.ebookChat.authentication.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebookChat.authentication.domain.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	Role findByName(String name);
}
