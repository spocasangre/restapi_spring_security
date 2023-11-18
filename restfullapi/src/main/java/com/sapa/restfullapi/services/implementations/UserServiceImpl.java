package com.sapa.restfullapi.services.implementations;

import com.sapa.restfullapi.models.entities.User;
import com.sapa.restfullapi.repositories.UserRepository;
import com.sapa.restfullapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email).get();
    }
}
