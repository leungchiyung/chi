package com.example.chi.yung;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leung")

public class leung {
    @RequestMapping("/yung")
    public String helloworld() {
        return "666 hello world!!!";
    }
}

