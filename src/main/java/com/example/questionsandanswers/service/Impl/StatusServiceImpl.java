package com.example.questionsandanswers.service.Impl;

import com.example.questionsandanswers.entity.Status;
import com.example.questionsandanswers.repository.StatusRepository;
import com.example.questionsandanswers.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StatusServiceImpl implements StatusService {

    private final StatusRepository statusRepository;

    @Autowired
    public StatusServiceImpl(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Status findById(Long id) {
        return statusRepository.findById(id).orElseThrow();
    }
}
