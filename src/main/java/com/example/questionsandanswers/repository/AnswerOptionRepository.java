package com.example.questionsandanswers.repository;

import com.example.questionsandanswers.entity.AnswerOption;
import com.example.questionsandanswers.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerOptionRepository extends JpaRepository<AnswerOption, Long> {

    List<AnswerOption> findAllByQuestion(Question question);
}
