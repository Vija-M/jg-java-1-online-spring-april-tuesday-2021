package students.ernests_subhankulovs.lesson_15.level_2.task_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FraudDetectorTest {

    @Test
    void testFraudFoundByName() {
        FraudDetector detector = new FraudDetector();
        Assertions.assertTrue(detector.isFraud(new Trader("Pokemon", "New York")));
    }

    @Test
    void testFraudFoundByCity() {
        FraudDetector detector = new FraudDetector();
        Assertions.assertTrue(detector.isFraud(new Trader("John Smith", "Sidney")));
    }

    @Test
    void testFraudFoundByBothNameAndCity() {
        FraudDetector detector = new FraudDetector();
        Assertions.assertTrue(detector.isFraud(new Trader("Pokemon", "Sidney")));
    }

    @Test
    void testFraudNotFound() {
        FraudDetector detector = new FraudDetector();
        Assertions.assertFalse(detector.isFraud(new Trader("John Smith", "New York")));
    }
}