package com.connectin.authenticate.controller;

import com.connectin.authenticate.entity.user.UserCred;
import com.connectin.authenticate.security.provider.AuthProvider;
import com.connectin.config.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller

public class AuthneticationController {

    @Autowired
    private ApplicationConfig appConfig;

    @Autowired
    private AuthProvider authProvider;


    @RequestMapping(value = "/api/login", method = RequestMethod.POST)
    public ResponseEntity<Object> register(@RequestBody UserCred user) {
        Authentication auth;
        try {
            auth = authProvider.authenticateUser(user.getId(), user.getPassword());
            System.out.println(auth);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;

    }


}