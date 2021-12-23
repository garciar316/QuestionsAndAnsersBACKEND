package com.example.questionsandanswers.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "ROUNDS")
public class Round implements Serializable {

    private static final long serialVersionUID = 7245828896363830725L;

    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "REWARD_ID")
    private Reward reward;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;
}
