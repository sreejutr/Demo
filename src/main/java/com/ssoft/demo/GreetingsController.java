package com.ssoft.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingsController {

    
    @RequestMapping("/")
    public @ResponseBody
    String greeting() {
        return "Hello, World";
    }
}
