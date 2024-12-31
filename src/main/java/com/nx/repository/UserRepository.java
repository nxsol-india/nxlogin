package com.nx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nx.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
