package students.linda_junkina.lesson_15.level_3.task_10_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoresTest {
    Scores score = new Scores("player1", "player2");

    @Test
    void loveLove() {
        assertEquals("Love - Love", score.score());
    }

    @Test
    void fifteenLove() {
        score.wonPoint("player1");
        assertEquals("Fifteen - Love", score.score());
    }

    @Test
    void thirtyLove() {
        score.wonPoint("player1");
        score.wonPoint("player1");
        assertEquals("Thirty - Love", score.score());
    }

    @Test
    void fortyLove() {
        score.wonPoint("player1");
        score.wonPoint("player1");
        score.wonPoint("player1");
        assertEquals("Forty - Love", score.score());
    }

    @Test
    void fortyFifteen() {
        score.wonPoint("player1");
        score.wonPoint("player1");
        score.wonPoint("player1");

        score.wonPoint("player2");

        assertEquals("Forty - Fifteen", score.score());
    }

    @Test
    void fortyThirty() {
        score.wonPoint("player1");
        score.wonPoint("player1");
        score.wonPoint("player1");

        score.wonPoint("player2");
        score.wonPoint("player2");

        assertEquals("Forty - Thirty", score.score());
    }

    @Test
    void deuce() {
        score.wonPoint("player1");
        score.wonPoint("player1");
        score.wonPoint("player1");

        score.wonPoint("player2");
        score.wonPoint("player2");
        score.wonPoint("player2");

        assertEquals("Deuce!", score.score());
    }

    @Test
    void advantage() {
        score.wonPoint("player1");
        score.wonPoint("player1");
        score.wonPoint("player1");

        score.wonPoint("player2");
        score.wonPoint("player2");
        score.wonPoint("player2");
        score.wonPoint("player2");

        assertEquals("Advantage player2", score.score());
    }
}