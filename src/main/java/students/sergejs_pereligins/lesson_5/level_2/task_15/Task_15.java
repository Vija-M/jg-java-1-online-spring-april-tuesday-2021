package students.sergejs_pereligins.lesson_5.level_2.task_15;


import java.util.Random;
import java.util.Arrays;

public class Task_15 {
    public static void main(String[] args) {
        int[] recd = new int[3];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < recd.length; i++) {
            recd[i] = random.nextInt(100);
            sum=sum+recd[i];

        }
        System.out.println("Arrrays: "+ Arrays.toString(recd));
        for (int i = 0; i < recd.length; i++) {
            recd[i] = recd[i] + 2;
            System.out.println("Double numbers: "+recd[i]);
        }
    }
}
