package instructor.lesson_10.dependencyinjection;

class DailyAdviceApplication {

    public static void main(String[] args) {

        DailyAdviceGenerator generator = new DailyAdviceGenerator(new RandomNumberGenerator());
        System.out.println(generator.nextAdvice());

    }
}
