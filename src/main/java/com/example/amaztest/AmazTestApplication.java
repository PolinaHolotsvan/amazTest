package com.example.amaztest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AmazTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmazTestApplication.class, args);
    }
    @GetMapping("/")
    public String hello(){
        return "Hello world";
    }
    @GetMapping("/rat")
    public String helloRat(){
        return "Hello rat";
    }
}
