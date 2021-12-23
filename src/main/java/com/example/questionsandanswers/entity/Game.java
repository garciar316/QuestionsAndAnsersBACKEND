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
@Table(name = "GAMES")
public class Game implements Serializable {

    private static final long serialVersionUID = 3250754480913219038L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ACCUMULATED", nullable = false)
    private int accumulated;

    @ManyToOne
    @JoinColumn(name = "STATUS_ID")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "ROUND_ID")
    private Round round;

    @ManyToOne
    @JoinColumn(name = "PLAYER_ID")
    private Player player;
}
