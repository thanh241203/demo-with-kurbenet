package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping()
    public String sayHello2() {
        return  "Hellop thanh";
    }

    @GetMapping("/get-all")
    public String sayHello1() {
        return  "dang o day";
    }
}
