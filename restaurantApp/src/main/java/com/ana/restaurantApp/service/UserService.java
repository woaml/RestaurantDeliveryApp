package com.ana.restaurantApp.service;

import com.ana.restaurantApp.model.User;

public interface UserService {
    public User findUserByJwtToken(String jwt) throws Exception;
    public User findUserByEmail (String email) throws Exception;
}

