package com.example.questionsandanswers.rest;

import com.example.questionsandanswers.entity.AnswerOption;
import com.example.questionsandanswers.entity.Game;
import com.example.questionsandanswers.entity.Player;
import com.example.questionsandanswers.service.PlayService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("jugar")
public class PlayRest {

    private final PlayService playS;

    public PlayRest(PlayService playS) {
        this.playS = playS;
    }

    @PostMapping("/empezar")
    public ResponseEntity<String> startGame(@RequestBody Player player) {
        playS.startGame(player);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/continuar")
    public ResponseEntity<Game> continueGame(@RequestBody AnswerOption answerOption) {
        return ResponseEntity.ok(playS.controlGame(answerOption));
    }

    @PostMapping("/terminado")
    public ResponseEntity<Game> finishGame(@RequestBody Game game) {
        return ResponseEntity.ok(playS.finishGame(game));
    }
}
