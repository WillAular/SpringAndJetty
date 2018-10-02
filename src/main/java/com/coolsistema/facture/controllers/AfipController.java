package com.coolsistema.facture.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class AfipController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
}
