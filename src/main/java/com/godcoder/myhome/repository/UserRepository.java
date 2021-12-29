package com.godcoder.myhome.repository;

import com.godcoder.myhome.model.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    // n+1 sql 문제해결
    @EntityGraph(attributePaths = { "boards" })
    List<User> findAll();

    User findByUsername(String username);

}
