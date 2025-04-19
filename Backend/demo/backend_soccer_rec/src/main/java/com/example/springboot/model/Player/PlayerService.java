package com.example.springboot.model.Player;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class PlayerService {

    public List<Player> getPlayers(){
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
