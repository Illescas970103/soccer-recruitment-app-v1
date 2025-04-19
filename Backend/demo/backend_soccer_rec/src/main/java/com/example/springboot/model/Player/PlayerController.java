package com.example.springboot.model.Player;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/Players")
public class PlayerController {
    private final PlayerService PlayerService;
    @Autowired
    public PlayerController(com.example.springboot.model.Player.PlayerService playerService) {
        PlayerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers(){

        return PlayerService.getPlayers();

    }
    //this class will have all the resources from api

}
