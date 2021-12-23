package com.example.questionsandanswers.service.Impl;

import com.example.questionsandanswers.entity.AnswerOption;
import com.example.questionsandanswers.entity.Question;
import com.example.questionsandanswers.repository.AnswerOptionRepository;
import com.example.questionsandanswers.service.AnswerOptionService;
import com.example.questionsandanswers.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
public class AnswerOptionServiceImpl implements AnswerOptionService {

    private final AnswerOptionRepository answerOptionRepository;

    private final QuestionService questionS;

    @Autowired
    public AnswerOptionServiceImpl(AnswerOptionRepository answerOptionRepository, QuestionService questionS){
        this.answerOptionRepository = answerOptionRepository;
        this.questionS = questionS;
    }

    @Override
    public AnswerOption findById(Long id) {
        return answerOptionRepository.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly = true)
    public List<AnswerOption> findAnswerOptionsByQuestionId(Long questionId) {
        Question question = questionS.findById(questionId);

        List<AnswerOption> answerOptions = answerOptionRepository.findAllByQuestion(question);
        Collections.shuffle(answerOptions);
        return answerOptions;
    }
}
