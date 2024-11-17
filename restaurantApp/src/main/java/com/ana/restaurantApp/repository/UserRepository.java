package com.ana.restaurantApp.repository;

import com.ana.restaurantApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findUserByEmail(String username);
}
