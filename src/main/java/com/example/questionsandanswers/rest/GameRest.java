package com.example.questionsandanswers.rest;

import com.example.questionsandanswers.entity.Game;
import com.example.questionsandanswers.service.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("juego")
public class GameRest {

    private final GameService gameS;

    public GameRest(GameService gameS) {
        this.gameS = gameS;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Game>> getAll() {
        return ResponseEntity.ok(gameS.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Game> getGameById(@PathVariable Long id) {
        return ResponseEntity.ok(gameS.findById(id));
    }

    @GetMapping("/activo")
    public ResponseEntity<Game> getActiveGame() {
        return ResponseEntity.ok(gameS.findActiveGame());
    }
}
