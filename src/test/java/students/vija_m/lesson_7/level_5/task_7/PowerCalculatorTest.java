package students.vija_m.lesson_7.level_5.task_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerCalculatorTest {
    private PowerCalculator subject = new PowerCalculator();

    @Test
    void shouldPowerZero() {
        double actual = subject.power(0, 3);
        double expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPowerOne() {
        double actual = subject.power(1, 10);
        double expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPowerDouble() {
        double actual = subject.power(2.5, 2);
        double expected = 6.25;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPowerNegative1() {
        double actual = subject.power(-2, 4);
        double expected = 16;
        assertEquals(expected, actual);
    }

    @Test
    void shouldPowerNegative2() {
        double actual = subject.power(-3, 3);
        double expected = -27;
        assertEquals(expected, actual);
    }
}




