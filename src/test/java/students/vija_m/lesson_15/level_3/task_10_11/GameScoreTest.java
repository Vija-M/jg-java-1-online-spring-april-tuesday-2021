package students.vija_m.lesson_15.level_3.task_10_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameScoreTest {
    GameScore victim = new GameScore("player1", "player2");

    @Test
    void loveLove() {
        assertEquals("Love - Love", victim.score());
    }

    @Test
    void fifteenLove() {
        victim.wonPoint("player1");
        assertEquals("Fifteen - Love", victim.score());
    }

    @Test
    void thirtyLove() {
        victim.wonPoint("player1");
        victim.wonPoint("player1");
        assertEquals("Thirty - Love", victim.score());
    }

    @Test
    void fortyLove() {
        victim.wonPoint("player2");
        victim.wonPoint("player2");
        victim.wonPoint("player2");
        assertEquals("Love - Forty", victim.score());
    }

    @Test
    void fortyFifteen() {
        victim.wonPoint("player1");
        victim.wonPoint("player2");
        victim.wonPoint("player1");
        victim.wonPoint("player1");

        assertEquals("Forty - Fifteen", victim.score());
    }

    @Test
    void fortyThirty() {
        victim.wonPoint("player2");
        victim.wonPoint("player2");
        victim.wonPoint("player1");
        victim.wonPoint("player1");
        victim.wonPoint("player1");

        assertEquals("Forty - Thirty", victim.score());
    }

    @Test
    void deuce() {
        victim.wonPoint("player1");
        victim.wonPoint("player2");
        victim.wonPoint("player1");
        victim.wonPoint("player2");
        victim.wonPoint("player1");
        victim.wonPoint("player2");

        assertEquals("Deuce!", victim.score());
    }

    @Test
    void advantage() {
        victim.wonPoint("player1");
        victim.wonPoint("player2");
        victim.wonPoint("player1");
        victim.wonPoint("player2");
        victim.wonPoint("player1");
        victim.wonPoint("player2");
        victim.wonPoint("player1");

        assertEquals("Advantage player1", victim.score());
    }
}
