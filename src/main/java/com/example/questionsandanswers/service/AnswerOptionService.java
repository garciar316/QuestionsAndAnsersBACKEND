package com.example.questionsandanswers.service;

import com.example.questionsandanswers.entity.AnswerOption;
import com.example.questionsandanswers.entity.Question;

import java.util.List;

public interface AnswerOptionService {

    AnswerOption findById(Long id);

    List<AnswerOption> findAnswerOptionsByQuestionId(Long questionId);
}
