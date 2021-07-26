package instructor.lesson_10.dependencyinjection;

class DailyAdviceGenerator {

    private final DailyAdvice[] advices = {
            new DailyAdvice("Always wash your hands 🧼", "John Doe"),
            new DailyAdvice("Don't worry - be happy! 😜", "Bob Marley"),
            new DailyAdvice("Take it easy", "MIKA"),
            new DailyAdvice("Treat yourself", "Lorem"),
            new DailyAdvice("No pain, no gain 💪", "Ipsum"),
            new DailyAdvice("Never give up 😤", "Rick Roll")
    };

    // Dependency
    private final NumberGenerator numberGenerator;

    // Constructor Dependency Injection
    DailyAdviceGenerator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    DailyAdvice nextAdvice() {
        return advices[numberGenerator.nextInt(advices.length)];
    }
}
