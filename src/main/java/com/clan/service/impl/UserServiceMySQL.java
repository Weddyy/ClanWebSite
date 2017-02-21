package com.clan.service.impl;

import com.clan.model.User;
import com.clan.model.UserInfo;
import com.clan.repository.UserRepository;
import com.clan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by weddy on 20.02.17.
 */
@Service
public class UserServiceMySQL implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserByEmailAndPassword(String email, String pass) {
        User user = userRepository.findByEmail(email);
        if(user!=null && user.getPasswrd().equals(pass))
            return user;

        return null;
    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void changeUser(User user) {

    }

    @Override
    public void updateUserInfo(int id, UserInfo info) {

    }
}
