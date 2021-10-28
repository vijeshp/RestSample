package com.example.mysample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

    @GetMapping("/first")
    public String myRestAPI() {
        return "First API testing";
    }
}
