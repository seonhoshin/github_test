package com.preproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {
    @GetMapping("/")
    public String helloWorld(){
        return "To-do Application !";
    }

    @GetMapping("/temp")
    public String helloWorld2(){
        return "Temp-temp Application !";
    }

    @GetMapping("/dev")
    public String helloPR(){
        return "Pull Request";
    }
}
