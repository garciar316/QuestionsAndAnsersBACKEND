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
@Table(name = "REWARDS")
public class Reward implements Serializable {

    private static final long serialVersionUID = 6273742163195983353L;

    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "AMOUNT", nullable = false)
    private int amount;
}
