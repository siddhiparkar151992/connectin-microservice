package com.connectin.authenticate.service;

import java.util.HashMap;

import com.connectin.business.security.encryption.Encryptor;
import com.connectin.business.user.entity.UserCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.connectin.authenticate.entity.AuthErrors;
import com.connectin.authenticate.entity.user.UserCred;
import com.connectin.authenticate.util.exceptions.InvalidCredentialsException;

@Service("authService")
public class AuthenticationManager implements IAuthenticator {
    @Autowired
    Encryptor encryptor;
    @Autowired
    private IAuthenticationService authService;

    @Override
    public HashMap<String, UserCredentials> login(UserCred userCreds) throws InvalidCredentialsException, Exception {
        String password;
        String username;
        HashMap<String, UserCredentials> userData = new HashMap<String, UserCredentials>();
        password = userCreds.getPassword();
        username = userCreds.getId();
        if (password == null || username == null) {
            throw new InvalidCredentialsException(AuthErrors.INVALID_USER_CREDS);
        }
        String encryptedPassword = encryptor.encrypt(password);
        userData.put("userData", authService.login(username, encryptedPassword));
        return userData;


    }

    @Override
    public void logout(String username, String password) {
        // TODO Auto-generated method stub

    }

}
