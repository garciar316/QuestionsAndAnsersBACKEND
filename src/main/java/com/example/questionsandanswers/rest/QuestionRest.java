package com.example.questionsandanswers.rest;

import com.example.questionsandanswers.entity.Question;
import com.example.questionsandanswers.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("preguntas")
public class QuestionRest {

    private final QuestionService questionS;

    @Autowired
    public QuestionRest(QuestionService questionS) {
        this.questionS = questionS;
    }

    @GetMapping("/{categoryId}")
    public ResponseEntity<Question> getQuestion(@PathVariable Long categoryId) {
        return ResponseEntity.ok(questionS.findRandomByCategoryId(categoryId));
    }
}
