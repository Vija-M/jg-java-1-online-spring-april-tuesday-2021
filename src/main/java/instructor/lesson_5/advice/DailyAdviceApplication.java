package instructor.lesson_5.advice;

class DailyAdviceApplication {

    public static void main(String[] args) {

        DailyAdvice dailyAdvice = new DailyAdvice();

        System.out.println("Advice of the day ☝️🤓");
        System.out.println(dailyAdvice.getAdvice());

    }
}
