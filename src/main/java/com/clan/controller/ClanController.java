package com.clan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by weddy on 21.02.17.
 */
@Controller
@RequestMapping("/clan")
public class ClanController {

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public String getClanPage(@PathVariable("name") String name)
    {
        return "clan";
    }

}
