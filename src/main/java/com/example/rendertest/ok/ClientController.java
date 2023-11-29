package com.example.rendertest.ok;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    @GetMapping(value = "/")
    public String sayHello(){
        return "alilox";
    }
}