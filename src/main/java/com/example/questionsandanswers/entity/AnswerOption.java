package com.example.questionsandanswers.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "ANSWER_OPTIONS")
public class AnswerOption implements Serializable {

    private static final long serialVersionUID = 2458951205623260605L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "IS_VALID", nullable = false)
    private boolean isValid;

    @ManyToOne
    @JoinColumn(name = "QUESTION_ID")
    private Question question;
}
