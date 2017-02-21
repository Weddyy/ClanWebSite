package com.clan.controller;

import com.clan.model.UserInfo;
import com.clan.service.impl.UserServiceMySQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weddy on 21.02.17.
 */
@RestController(value = "/user")
public class AccountController {

    @Autowired
    UserServiceMySQL service;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public UserInfo getInfo()
    {
        return null;
    }
}
