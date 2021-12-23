package com.example.questionsandanswers.service.Impl;

import com.example.questionsandanswers.entity.Player;
import com.example.questionsandanswers.repository.PlayerRepository;
import com.example.questionsandanswers.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Player findById(String id) {
        return playerRepository.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    @Override
    @Transactional
    public Player save(Player player) {
        return playerRepository.save(player);
    }
}
