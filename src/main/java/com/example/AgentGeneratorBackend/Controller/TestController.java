package com.example.AgentGeneratorBackend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    String hello() {
        return "Hola Mundo";
    }
}
