package com.inaing.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inaing.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    @Query(value = "SELECT * FROM user WHERE email = :login OR mobile = :login", nativeQuery = true)
    Optional<User> findByEmailOrMobile(@Param("login") String login);
    
}
