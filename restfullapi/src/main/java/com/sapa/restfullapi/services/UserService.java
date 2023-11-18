package com.sapa.restfullapi.services;

import com.sapa.restfullapi.models.entities.User;

public interface UserService {
    public User findByEmail(String email);
}
