package com.example.questionsandanswers.service.Impl;

import com.example.questionsandanswers.entity.Game;
import com.example.questionsandanswers.entity.Player;
import com.example.questionsandanswers.entity.Round;
import com.example.questionsandanswers.entity.Status;
import com.example.questionsandanswers.repository.GameRepository;
import com.example.questionsandanswers.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    @Autowired
    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Game findById(Long id) {
        return gameRepository.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    @Override
    @Transactional
    public Game save(Game game) {
        return gameRepository.save(game);
    }

    @Override
    @Transactional
    public Game initializeGame(Player player, Status status, Round round) {
        Game game = new Game();
        game.setStatus(status);
        game.setAccumulated(0);
        game.setPlayer(player);
        game.setRound(round);

        return save(game);
    }

    @Override
    @Transactional(readOnly = true)
    public Game findActiveGame() {
        return gameRepository.findActive();
    }

    @Override
    @Transactional
    public void closeGames() {
        gameRepository.closeAllGames();
    }
}
