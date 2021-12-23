package com.example.questionsandanswers.service;

import com.example.questionsandanswers.entity.AnswerOption;
import com.example.questionsandanswers.entity.Game;
import com.example.questionsandanswers.entity.Player;
import com.example.questionsandanswers.entity.Question;

import java.util.List;

public interface PlayService {

    void startGame(Player player);

    Game controlGame(AnswerOption answerOption);

    Game continueGame(Game game);

    Game finishGame(Game game);

    Game winGame(Game game);

    Game loseGame(Game game);
}
