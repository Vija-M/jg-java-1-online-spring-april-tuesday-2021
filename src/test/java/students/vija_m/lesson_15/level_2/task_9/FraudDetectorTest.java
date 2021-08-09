package students.vija_m.lesson_15.level_2.task_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {
    FraudDetector victim = new FraudDetector();

    @Test
    void notFraud() {
        assertFalse(victim.isFraud(new Trader("John", "Paris")));
    }

    @Test
    void cityIsBlocked() {
        assertTrue(victim.isFraud(new Trader("Roberto", "Sidney")));
    }

    @Test
    void traderIsFraud() {
        assertTrue(victim.isFraud(new Trader("Pokemon", "Riga")));
    }
}