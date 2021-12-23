package com.example.questionsandanswers.service;

import com.example.questionsandanswers.entity.Player;

import java.util.List;

public interface PlayerService {

    Player findById(String id);

    List<Player> findAll();

    Player save(Player player);
}
