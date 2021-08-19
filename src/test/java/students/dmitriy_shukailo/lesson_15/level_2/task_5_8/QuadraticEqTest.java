package students.dmitriy_shukailo.lesson_15.level_2.task_5_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuadraticEqTest {

    QuadraticEq quadraticEq = new QuadraticEq();

    @Test
    public void discriminantGreaterThanZero() {
        assertEquals("x1 = -1.5, x2 = -0.5", quadraticEq.calc(4, 8, 3));
    }

    @Test
    public void discriminantEqualsZero() {
        assertEquals("x = -4.0", quadraticEq.calc(1, 8, 16));
    }

    @Test
    public void discriminantLessThanZero() {
        assertEquals("Equation has no roots", quadraticEq.calc(1, 2, 3));
    }

}