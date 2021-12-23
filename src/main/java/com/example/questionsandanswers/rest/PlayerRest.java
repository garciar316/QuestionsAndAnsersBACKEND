package com.example.questionsandanswers.rest;

import com.example.questionsandanswers.entity.Player;
import com.example.questionsandanswers.service.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("jugador")
public class PlayerRest {

    private final PlayerService playerS;

    public PlayerRest(PlayerService playerS) {
        this.playerS = playerS;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Player>> getAllPlayers() {
        return ResponseEntity.ok(playerS.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Player> getPlayer(@PathVariable String id) {
        return ResponseEntity.ok(playerS.findById(id));
    }
}
