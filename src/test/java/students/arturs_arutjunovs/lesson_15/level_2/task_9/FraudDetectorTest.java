package students.arturs_arutjunovs.lesson_15.level_2.task_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class FraudDetectorTest {

    FraudDetector detect = new FraudDetector();

    @Test
    public void prohibitedTrader() {
        assertTrue(detect.isFraud(new Trader("Pokemon", "Sidney")));
        assertTrue(detect.isFraud(new Trader("Poul", "Sidney")));
    }

    @Test
    public void prohibitedName() {
        assertTrue(detect.isFraud(new Trader("Pokemon", "Tokyo")));
    }

    @Test
    public void clearTrader() {
        assertFalse(detect.isFraud(new Trader("Willie", "Kuala Lumpur")));
    }
}
