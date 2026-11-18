package fr.formation.hello.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController 
public class HelloRestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, it's meeee ...";
    }
    

}
