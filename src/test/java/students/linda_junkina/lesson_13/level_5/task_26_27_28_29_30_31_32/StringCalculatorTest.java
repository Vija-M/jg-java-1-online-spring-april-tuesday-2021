package students.linda_junkina.lesson_13.level_5.task_26_27_28_29_30_31_32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator calculator = new StringCalculator();

    @Test
    void emptyStringShouldReturn0() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    void returnsNumberIfIsSingle() {
        assertEquals(1, calculator.add("1"));
    }

    @Test
    void returnsSumOfNumbers() {
        assertEquals(3, calculator.add("1,2"));
    }

    @Test
    void returnsSumOf10Numbers() {
        assertEquals(55, calculator.add("1,2,3,4,5,6,7,8,9,10"));
    }

    @Test
    void ifIntegersAreDividedWithLine() {
        assertEquals(10, calculator.add("1\n2,3,4"));
    }

    @Test
    void otherDelimiters() {
        assertEquals(3, calculator.add("//[;]\n1;2"));
    }

    @Test
    void multipleDelimiters() {
        assertEquals(6, calculator.add("//[;][&]\n1;2&3"));
    }
}