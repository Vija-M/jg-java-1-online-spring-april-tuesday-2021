package students.ernests_subhankulovs.lesson_13.level_3.task_12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeNextGenerationCalculatorTest {

    boolean[][] grid = {{ true,  true,  true},
                        {false,  true,  true},
                        { true, false,  true}};

    @Test
    void cell1x1lives() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertTrue(calculator.calculate(grid)[0][0]);
    }

    @Test
    void cell1x2lives() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertTrue(calculator.calculate(grid)[0][1]);
    }

    @Test
    void cell1x3lives() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertTrue(calculator.calculate(grid)[0][2]);
    }

    @Test
    void cell2x1isDead() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertFalse(calculator.calculate(grid)[1][0]);
    }

    @Test
    void cell2x2lives() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertTrue(calculator.calculate(grid)[1][1]);
    }

    @Test
    void cell2x3lives() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertTrue(calculator.calculate(grid)[1][2]);
    }

    @Test
    void cell3x1dies() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertFalse(calculator.calculate(grid)[2][0]);
    }

    @Test
    void cell3x2isDead() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertFalse(calculator.calculate(grid)[2][1]);
    }

    @Test
    void cell3x3lives() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();
        assertTrue(calculator.calculate(grid)[2][2]);
    }
}