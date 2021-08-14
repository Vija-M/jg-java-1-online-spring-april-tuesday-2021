package students.dmitrijs_matrenicevs.lesson_15.level_2.task_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    @Test
    void isFraudWhenNameIsBanned() {
        assertTrue(fraudDetector.isFraud(new Trader("Pokemon", "Riga")));
    }

    @Test
    void isFraudWhenCityIsBanned() {
        assertTrue(fraudDetector.isFraud(new Trader("Pika", "Sydney")));
    }

    @Test
    void isFraudWhenNameAndCityAreBanned() {
        assertTrue(fraudDetector.isFraud(new Trader("Pokemon", "Sydney")));
    }

    @Test
    void isNotFraud() {
        assertFalse(fraudDetector.isFraud(new Trader("Jeff", "Sweden")));
    }
}