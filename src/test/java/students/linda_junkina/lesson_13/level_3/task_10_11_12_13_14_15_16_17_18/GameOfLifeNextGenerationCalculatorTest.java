package students.linda_junkina.lesson_13.level_3.task_10_11_12_13_14_15_16_17_18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeNextGenerationCalculatorTest {
    GameOfLifeNextGenerationCalculator nextGenerationCalculator = new GameOfLifeNextGenerationCalculator();
    boolean[][] field =
                    {{false, true, true, true},
                    {true, false, true, true},
                    {false, true, true, false},
                    {true, true, false, true}};

    @Test
    void shouldDieIfLessThan2Neighbours() {
        assertFalse(nextGenerationCalculator.calculate(field)[3][3]);
    }

    @Test
    void shouldLiveIf2Neighbours() {
        assertTrue(nextGenerationCalculator.calculate(field)[0][3]);

    }
}