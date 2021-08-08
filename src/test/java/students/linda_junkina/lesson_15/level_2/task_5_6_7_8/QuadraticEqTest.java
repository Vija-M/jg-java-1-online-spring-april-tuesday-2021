package students.linda_junkina.lesson_15.level_2.task_5_6_7_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEqTest {
    QuadraticEq quadraticEq = new QuadraticEq();

    @Test
    void discriminantGreaterThan0() {
        assertEquals("x1 = -1.0, x2 = 5.0", quadraticEq.calc(1, -4, -5));
    }

    @Test
    void discriminantEquals0() {
        assertEquals("x = -3.0", quadraticEq.calc(1, 6, 9));
    }

    @Test
    void discriminantLessThan0() {
        assertEquals("Equation has no roots", quadraticEq.calc(1, 2, 5));
    }
}