package students.ernests_subhankulovs.lesson_13.level_5.task_30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    private StringCalculator calculator = new StringCalculator();

    @Test
    public void shouldReturnZeroIfEmpty() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void shouldReturnZeroIfZero() {
        assertEquals(0, calculator.add("0"));
    }

    @Test
    public void shouldReturnNumber() {
        assertEquals(1, calculator.add("1"));
    }

    @Test
    public void shouldReturnTwoNumberSumV1() {
        assertEquals(3, calculator.add("1,2"));
    }

    @Test
    public void shouldReturnTwoNumberSumV2() {
        assertEquals(5, calculator.add("2,3"));
    }

    @Test
    public void shouldReturnTwoNumberSumWithLineBreak() {
        assertEquals(5, calculator.add("2\n3"));
    }

    @Test
    public void shouldReturnThreeNumberSum() {
        assertEquals(9, calculator.add("2,3,4"));
    }

    @Test
    public void shouldReturnThreeNumberSumWithLineBreak() {
        assertEquals(9, calculator.add("2,3\n4"));
    }

    @Test
    public void shouldReturnThreeNumberSumWithCustomDelimiter() {
        assertEquals(9, calculator.add("//[;]\n2;3,4"));
    }

}