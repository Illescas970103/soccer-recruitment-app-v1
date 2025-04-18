package com.example.springboot.controller;
import com.example.springboot.model.Player.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/api") //organizar rutas desde el backend REST
public class HelloController {
    @GetMapping("/hello")
    public List<Player> sayHello(){
        return List.of(
                new Player(
                        1L,
                        "Kylian Mbappe",
                        "Striker",
                        LocalDate.of(1997, Month.MARCH,5),
                        25,
                        "illescasalfredo98@gmail.com",
                        "Real Madrid",
                        "France",
                        75,
                        LocalDate.of(2012,Month.APRIL,3)





                )
        );
    }
}
