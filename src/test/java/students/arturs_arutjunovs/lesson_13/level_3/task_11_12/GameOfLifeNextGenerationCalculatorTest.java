package students.arturs_arutjunovs.lesson_13.level_3.task_11_12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameOfLifeNextGenerationCalculatorTest {

    boolean[][] grid = {{true, true, true},
                       {false, true, true},
                       {true, false, true}};

    @Test
    void cell1x1isLive() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertTrue(calculator.calculate(grid)[0][0]);
    }

    @Test
    void cell1x2isLive() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertTrue(calculator.calculate(grid)[0][1]);
    }

    @Test
    void cell1x3isLive() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertTrue(calculator.calculate(grid)[0][2]);
    }

    @Test
    void cell2x1isDead() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertFalse(calculator.calculate(grid)[1][0]);
    }

    @Test
    void cell2x2isLive() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertTrue(calculator.calculate(grid)[1][1]);
    }

    @Test
    void cell2x3isLive() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertTrue(calculator.calculate(grid)[1][2]);
    }

    @Test
    void cell3x1isDied() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertFalse(calculator.calculate(grid)[2][0]);
    }

    @Test
    void cell3x2isDead() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertFalse(calculator.calculate(grid)[2][1]);
    }

    @Test
    void cell3x3isLive() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertTrue(calculator.calculate(grid)[2][2]);
    }
}
