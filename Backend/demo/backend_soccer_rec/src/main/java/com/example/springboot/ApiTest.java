package com.example.springboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {
    @GetMapping("/api/hello")
    public String hello(){
        return "Hola desde el backend";
    }
}
