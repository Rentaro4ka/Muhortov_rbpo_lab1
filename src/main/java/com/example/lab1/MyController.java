package com.example.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Контроллер работает";
    }

    @GetMapping("/numbers")
    public String getNumbers() {
        return "1, 2, 3, 4, 6";
    }
}