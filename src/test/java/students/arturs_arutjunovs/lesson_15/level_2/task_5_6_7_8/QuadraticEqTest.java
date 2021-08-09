package students.arturs_arutjunovs.lesson_15.level_2.task_5_6_7_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuadraticEqTest {

    QuadraticEq qEq = new QuadraticEq();

    @Test
    public void whenDiscriminantGreaterThanZero() {
        assertEquals("x1 = -3.0, x2 = -2.0", qEq.calc(1, 5, 6));

    }

    @Test
    public void whenDiscriminantEqualsZero() {
        assertEquals("x = -1.0", qEq.calc(2, 4, 2));

    }

    @Test
    public void whenDiscriminantLessThanZero() {
        assertEquals("Equation has no roots", qEq.calc(3, 2, 1));
    }
}
