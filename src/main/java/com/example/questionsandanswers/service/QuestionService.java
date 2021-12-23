package com.example.questionsandanswers.service;

import com.example.questionsandanswers.entity.Question;

public interface QuestionService {

    Question findById(Long id);

    Question findRandomByCategoryId(Long categoryId);
}
