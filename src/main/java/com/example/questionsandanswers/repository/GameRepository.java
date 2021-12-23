package com.example.questionsandanswers.repository;

import com.example.questionsandanswers.entity.Game;
import com.example.questionsandanswers.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    @Query("select g from Game g where g.status.id = 1")
    Game findActive();

    @Modifying
    @Query("update Game g set g.status.id = 3, g.accumulated = 0 where g.status.id = 1")
    void closeAllGames();
}
