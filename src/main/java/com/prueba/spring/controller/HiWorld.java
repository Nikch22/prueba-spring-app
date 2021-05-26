package com.prueba.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HiWorld {

    @RequestMapping(method=RequestMethod.GET)
    public String sayHi() {
        return "Hey World";
    }

}




