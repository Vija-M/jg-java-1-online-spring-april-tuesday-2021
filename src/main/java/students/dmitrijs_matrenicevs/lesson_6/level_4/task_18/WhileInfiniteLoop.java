package students.dmitrijs_matrenicevs.lesson_6.level_4.task_18;

import java.util.Random;

class WhileInfiniteLoop {

    public static void main(String[] args) {

        Random random = new Random();

        while (true) {
            int number = random.nextInt(50);
            System.out.println(number);

        }
    }

}
