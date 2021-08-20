package students.ernests_subhankulovs.lesson_15.level_2.task_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuadraticEqTest {

    @Test
    void testDiscriminantGreaterThanZero() {
        QuadraticEq quadraticEq = new QuadraticEq();
        Assertions.assertEquals("x1 = -1.0, x2 = -0.5", quadraticEq.calc(2, 3, 1));
    }

    @Test
    void testDiscriminantEqualsZero() {
        QuadraticEq quadraticEq = new QuadraticEq();
        Assertions.assertEquals("x = -1.0", quadraticEq.calc(1, 2, 1));
    }

    @Test
    void testDiscriminantLessThanZero() {
        QuadraticEq quadraticEq = new QuadraticEq();
        Assertions.assertEquals("Equation has no roots", quadraticEq.calc(1, 2, 3));
    }
}