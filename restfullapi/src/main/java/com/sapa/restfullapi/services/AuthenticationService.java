package com.sapa.restfullapi.services;

import com.sapa.restfullapi.models.dtos.AuthenticationRequest;
import com.sapa.restfullapi.models.dtos.AuthenticationResponse;
import com.sapa.restfullapi.models.dtos.RegisterRequest;
import com.sapa.restfullapi.models.entities.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface AuthenticationService {
    public AuthenticationResponse register(RegisterRequest request);

    public AuthenticationResponse authenticate(AuthenticationRequest request);

    public void refreshToken(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException;

    public User getAuthenticatedUser();
}
