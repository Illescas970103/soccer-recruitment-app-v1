package com.example.springboot.model.Player;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PlayerConfig {

    @Bean
    CommandLineRunner commandLineRunner
            (PlayerRepository repository){
        return args -> {
                   Player Kylian= new Player(
                            "Kylian Mbappe",
                            "Striker",
                            LocalDate.of(1997, Month.MARCH,5),
                            25,
                            "illescasalfredo98@gmail.com",
                            "Real Madrid",
                            "France",
                            75,
                            LocalDate.of(2012,Month.APRIL,3)
                    );

                    Player Luka= new Player(
                    "Luka Modric",
                    "Midfielder",
                    LocalDate.of(1989, Month.JUNE,10),
                    39,
                    "LK_MOD98@gmail.com",
                    "Real Madrid",
                    "Croatia",
                    70,
                    LocalDate.of(2005,Month.AUGUST,10)

            );
                    repository.saveAll(
                            List.of(Kylian,Luka)
                    );
        };
    }
}
