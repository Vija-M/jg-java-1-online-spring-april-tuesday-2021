package students.eriks_jaloveckis.lesson_5.level_2.task_15;

import java.util.Random;

class Task15 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[3];
        number[0] = random.nextInt(7);
        number[1] = random.nextInt(7);
        number[2] = random.nextInt(7);
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println("-");
        number[0] = number[0] + 2;
        number[1] = number[1] + 2;
        number[2] = number[2] + 2;
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println();
        System.out.println("SECOND VARIANT");
        System.out.println();
        int[] secondVariant = new int[3];
        for (int i = 0; i < secondVariant.length; i++) {
            secondVariant[i] = random.nextInt(7);
            System.out.println(secondVariant[i]);
        }
        System.out.println("-");
        for (int i = 0; i < secondVariant.length; i++) {
            secondVariant[i] = secondVariant[i] += 2;
            System.out.println(secondVariant[i]);
        }

    }
}
