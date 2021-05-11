package instructor.lesson_3;

import java.util.Random;

class RandomDemo {

    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(101);

        System.out.println("x = " + x);
        System.out.println("random.nextInt(101) = " + random.nextInt(101));

    }
}
