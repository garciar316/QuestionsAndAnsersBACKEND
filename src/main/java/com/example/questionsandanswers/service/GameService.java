package com.example.questionsandanswers.service;

import com.example.questionsandanswers.entity.Game;
import com.example.questionsandanswers.entity.Player;
import com.example.questionsandanswers.entity.Round;
import com.example.questionsandanswers.entity.Status;

import java.util.List;

public interface GameService {

    Game findById(Long id);

    List<Game> findAll();

    Game save(Game game);

    Game initializeGame(Player player, Status status, Round round);

    Game findActiveGame();

    void closeGames();
}
