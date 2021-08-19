package students.linda_junkina.lesson_13.level_3.task_10_11_12_13_14_15_16_17_18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeNextGenerationCalculatorTest {
    GameOfLifeNextGenerationCalculator nextGenerationCalculator = new GameOfLifeNextGenerationCalculator();
    boolean[][] field =
                     {{false, true, false},
                    {false, true, false},
                    {false, true, false}};


    @Test
    void shouldDieIfLessThan2NeighboursAlive() {
        assertFalse(nextGenerationCalculator.calculate(field)[1][2]);
    }

    @Test
    void shouldLiveIf2NeighboursAlive() {
        assertTrue(nextGenerationCalculator.calculate(field)[1][1]);
    }

    @Test
    void shouldStayAliveIf2NeighboursAlive() {
        assertTrue(nextGenerationCalculator.calculate(field)[1][1]);
    }

    @Test
    void shouldBecomeAliveIf3NeighboursAlive() {
        assertTrue(nextGenerationCalculator.calculate(field)[0][1]);
    }
}