package com.example.questionsandanswers.service.Impl;

import com.example.questionsandanswers.entity.Category;
import com.example.questionsandanswers.entity.Question;
import com.example.questionsandanswers.repository.QuestionRepository;
import com.example.questionsandanswers.service.CategoryService;
import com.example.questionsandanswers.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    private final CategoryService categoryS;

    @Autowired
    public QuestionServiceImpl(QuestionRepository questionRepository, CategoryService categoryS){
        this.questionRepository = questionRepository;
        this.categoryS = categoryS;
    }

    @Override
    @Transactional(readOnly = true)
    public Question findById(Long id) {
        return questionRepository.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly = true)
    public Question findRandomByCategoryId(Long categoryId) {
        Category category = categoryS.findCategoryById(categoryId);
        List<Question> questions = questionRepository.findAllByCategory(category);
        return questions.get(new Random().nextInt(questions.size()));
    }
}
