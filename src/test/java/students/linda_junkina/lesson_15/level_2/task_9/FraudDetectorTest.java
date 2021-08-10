package students.linda_junkina.lesson_15.level_2.task_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    @Test
    void allMatch() {
        Trader trader = new Trader("Pokemon", "Sidney");
        assertTrue(fraudDetector.isFraud(trader));
    }

    @Test
    void nameMatch() {
        Trader trader = new Trader("Pokemon", "London");
        assertTrue(fraudDetector.isFraud(trader));
    }

    @Test
    void citiesMatch() {
        Trader trader = new Trader("Dobby", "Sidney");
        assertTrue(fraudDetector.isFraud(trader));
    }

    @Test
    void noMatch() {
        Trader trader = new Trader("Tom", "Berlin");
        assertFalse(fraudDetector.isFraud(trader));
    }
}