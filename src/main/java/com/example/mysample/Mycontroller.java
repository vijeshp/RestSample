package com.example.mysample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

    @GetMapping("/myfirst")
    public String myRestAPI() {
        return "First API";
    }
}
