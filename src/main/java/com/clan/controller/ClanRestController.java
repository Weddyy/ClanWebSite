package com.clan.controller;

import com.clan.model.clan.Clan;
import com.clan.service.ClanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weddy on 23.02.17.
 */
@RestController
@RequestMapping("/clan")
public class ClanRestController {

    @Autowired
    ClanService service;

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public ResponseEntity getAllClan()
    {
        Clan clan = service.getClan(12);
        return new ResponseEntity<>(clan, HttpStatus.OK);
    }
}
