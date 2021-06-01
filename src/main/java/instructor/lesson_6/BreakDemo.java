package instructor.lesson_6;

import java.util.Random;

class BreakDemo {

    public static void main(String[] args) {

        Random random = new Random();

        while (true) {
            int number = random.nextInt(100);

            System.out.println(number);

            if (number % 15 == 0) {
                System.out.println("EXIT");
                break;
            }
        }

    }
}
