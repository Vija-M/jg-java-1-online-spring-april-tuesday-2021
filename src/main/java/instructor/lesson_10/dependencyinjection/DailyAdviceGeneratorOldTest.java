package instructor.lesson_10.dependencyinjection;

class DailyAdviceGeneratorOldTest {

    public static void main(String[] args) {
        DailyAdviceGeneratorOldTest testRunner = new DailyAdviceGeneratorOldTest();
        testRunner.should_return_advice_by_john_doe();
        testRunner.should_return_advice_by_bob_marley();
    }

    void should_return_advice_by_john_doe() {
        String description = "Generate advice by John Doe";
        DailyAdviceGenerator subject = new DailyAdviceGenerator(new MockNumberGenerator(0));

        DailyAdvice expected = new DailyAdvice("Always wash your hands 🧼", "John Doe");
        DailyAdvice actual = subject.nextAdvice();

        assertThatEqual(expected, actual, description);
    }

    void should_return_advice_by_bob_marley() {
        String description = "Generate advice by Bob Marley";
        DailyAdviceGenerator subject = new DailyAdviceGenerator(new MockNumberGenerator(1));

        DailyAdvice expected = new DailyAdvice("Don't worry - be happy! 😜", "Bob Marley");
        DailyAdvice actual = subject.nextAdvice();

        assertThatEqual(expected, actual, description);
    }

    void assertThatEqual(DailyAdvice expected, DailyAdvice actual, String description) {
        if (expected.equals(actual)) {
            System.out.println("[ OK ]: " + description);
        } else {
            System.out.println("[FAIL]: " + description + ". Expected " + expected + ", but was " + actual);
        }
    }
}
