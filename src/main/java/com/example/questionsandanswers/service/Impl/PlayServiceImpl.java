package com.example.questionsandanswers.service.Impl;

import com.example.questionsandanswers.entity.AnswerOption;
import com.example.questionsandanswers.entity.Game;
import com.example.questionsandanswers.entity.Player;
import com.example.questionsandanswers.entity.Round;
import com.example.questionsandanswers.service.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlayServiceImpl implements PlayService {

    private final GameService gameS;

    private final PlayerService playerS;

    private final StatusService statusS;

    private final RoundService roundS;

    public PlayServiceImpl(GameService gameS,
                           PlayerService playerS,
                           StatusService statusS,
                           RoundService roundS) {
        this.gameS = gameS;
        this.playerS = playerS;
        this.statusS = statusS;
        this.roundS = roundS;
    }

    @Override
    public void startGame(Player player) {
        playerS.save(player);

        gameS.closeGames();
        gameS.initializeGame(player, statusS.findById(1L), roundS.findById(1L));
    }

    @Override
    public Game controlGame(AnswerOption answerOption) {
        Game activeGame = gameS.findActiveGame();
        if(activeGame.getRound().getId() < 5) {
            if (answerOption.isValid()) {
                return continueGame(activeGame);
            } else {
                return loseGame(activeGame);
            }
        } else {
            if (answerOption.isValid()) {
                return winGame(activeGame);
            } else {
                return loseGame(activeGame);
            }
        }
    }

    @Override
    public Game continueGame(Game game) {
        game.setAccumulated(game.getAccumulated() + game.getRound().getReward().getAmount());
        game.setRound(roundS.findById((long) (int) (game.getRound().getId() + 1)));
        return gameS.save(game);
    }

    @Override
    public Game finishGame(Game game) {
        if(game.getStatus().getId() == 1L) {
            game.setStatus(statusS.findById(2L));
        }
        return gameS.save(game);
    }

    @Override
    public Game winGame(Game game) {
        game.setStatus(statusS.findById(5L));
        return gameS.save(game);
    }

    @Override
    public Game loseGame(Game game) {
        game.setStatus(statusS.findById(4L));
        game.setAccumulated(0);
        return gameS.save(game);
    }
}
