package com.clan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by weddy on 19.02.17.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String indexPage()
    {
        return "index";
    }
}
