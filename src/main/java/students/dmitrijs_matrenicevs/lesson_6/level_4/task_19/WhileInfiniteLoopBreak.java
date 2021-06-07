package students.dmitrijs_matrenicevs.lesson_6.level_4.task_19;

import java.util.Random;

class WhileInfiniteLoopBreak {

    public static void main(String[] args) {

        Random random = new Random();

        while (true) {
            int number = random.nextInt(50);
            System.out.println(number);

            if (number % 10 == 0) {
                System.out.println("FINISH");
                break;
            }

        }
    }
}
