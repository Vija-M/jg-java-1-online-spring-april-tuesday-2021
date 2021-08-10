package students.dmitrijs_matrenicevs.lesson_15.level_2.task_5_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEqTest {

    QuadraticEq quadraticEq = new QuadraticEq();

    @Test
    void discriminantGreaterThanZero() {
    assertEquals ("x1 = -3.0, x2 = -2.0", quadraticEq.calc(1,5,6));

    }

    @Test
    void discriminantEqualsZero() {
        assertEquals("x = -1.0", quadraticEq.calc(2,4,2));
    }

    @Test
    void discriminantLessThanZero() {
        assertEquals("Equation has no roots", quadraticEq.calc(5,4,3));
    }
}