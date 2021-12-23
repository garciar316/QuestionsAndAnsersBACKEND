package com.example.questionsandanswers.rest;

import com.example.questionsandanswers.entity.AnswerOption;
import com.example.questionsandanswers.entity.Question;
import com.example.questionsandanswers.service.AnswerOptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("respuestas")
public class AnswerOptionRest {

    private final AnswerOptionService answerOptionS;

    public AnswerOptionRest(AnswerOptionService answerOptionS) {
        this.answerOptionS = answerOptionS;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnswerOption> getById(@PathVariable Long id) {
        return ResponseEntity.ok(answerOptionS.findById(id));
    }

    @GetMapping("/pregunta/{questionId}")
    public ResponseEntity<List<AnswerOption>> getAllOptions(@PathVariable Long questionId) {
        return ResponseEntity.ok(answerOptionS.findAnswerOptionsByQuestionId(questionId));
    }
}
