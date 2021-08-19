package students.dmitriy_shukailo.lesson_15.level_2.task_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    @Test
    void fraudTraderNameAndCity() {
        assertTrue(fraudDetector.isFraud(new Trader("Pokemon", "Sidney")));
    }

    @Test
    void fraudTraderCity() {
        assertTrue(fraudDetector.isFraud(new Trader("A", "Sidney")));
    }

    @Test
    void fraudTraderName() {
        assertTrue(fraudDetector.isFraud(new Trader("Pokemon", "B")));
    }

    @Test
    void notFraudTraderNameAndCity() {
        assertFalse(fraudDetector.isFraud(new Trader("A", "B")));
    }

}