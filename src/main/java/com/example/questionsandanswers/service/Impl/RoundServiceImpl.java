package com.example.questionsandanswers.service.Impl;

import com.example.questionsandanswers.entity.Round;
import com.example.questionsandanswers.repository.RoundRepository;
import com.example.questionsandanswers.service.RoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoundServiceImpl implements RoundService {

    private final RoundRepository roundRepository;

    @Autowired
    public RoundServiceImpl(RoundRepository roundRepository) {
        this.roundRepository = roundRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Round findById(Long id) {
        return roundRepository.findById(id).orElseThrow();
    }
}
