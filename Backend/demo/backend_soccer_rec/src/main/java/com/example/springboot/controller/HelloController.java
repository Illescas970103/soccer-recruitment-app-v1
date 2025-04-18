package com.example.springboot.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") //organizar rutas desde el backend REST
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hola desde el backend";
    }
}
