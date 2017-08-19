package com.connectin.business.account.registration.dao;

import com.connectin.business.user.entity.User;
import com.connectin.exceptions.ConnectinBaseException;

public interface IRegistrationDao {
    public User registerUser(User user) throws ConnectinBaseException;
}
