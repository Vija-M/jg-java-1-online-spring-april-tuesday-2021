package students.vija_m.lesson_15.level_2.task_7_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEqTest {

    QuadraticEq victim = new QuadraticEq();

    @Test
    void discriminantEqualsZero() {
        assertEquals("x = -0.5", victim.calc(4, 4, 1));
    }

    @Test
    void discriminantLessThenZero() {
        assertEquals("Equation has no roots", victim.calc(4, 3, 1));
    }

    @Test
    void discriminantMoreThenZero() {
        assertEquals("x1 = -5.0, x2 = -3.0", victim.calc(1, 8, 15));
    }
}