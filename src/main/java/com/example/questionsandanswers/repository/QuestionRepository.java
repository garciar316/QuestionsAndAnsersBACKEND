package com.example.questionsandanswers.repository;

import com.example.questionsandanswers.entity.Category;
import com.example.questionsandanswers.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findAllByCategory(Category category);
}
