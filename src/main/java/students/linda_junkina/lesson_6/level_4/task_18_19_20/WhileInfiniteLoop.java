package students.linda_junkina.lesson_6.level_4.task_18_19_20;

import java.util.Random;

class WhileInfiniteLoop {
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int number = random.nextInt(30);

            if (number % 2 != 0) {
                continue;
            }
            System.out.println("number = " + number);
            if (number == 10) {
                System.out.println("EXIT");
                break;
            }
        }
    }
}
