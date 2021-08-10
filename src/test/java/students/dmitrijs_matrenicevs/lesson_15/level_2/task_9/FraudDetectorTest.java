package students.dmitrijs_matrenicevs.lesson_15.level_2.task_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    @Test
    void compareTraderName() {
        assertTrue(fraudDetector.compareTraderName(new Trader("Pokemon", "Sidney")));
        assertTrue(fraudDetector.compareTraderName(new Trader("Pika", "Sidney")));
    }

    @Test
    void compareCity() {
        assertTrue(fraudDetector.compareCity(new Trader("Pokemon", "Sidney")));
    }

    @Test
    void isFraud() {
        assertTrue(fraudDetector.isFraud(new Trader("Brok", "Sweden ")));
    }
}