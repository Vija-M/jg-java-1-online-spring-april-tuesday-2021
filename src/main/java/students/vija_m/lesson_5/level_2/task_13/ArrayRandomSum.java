package students.vija_m.lesson_5.level_2.task_13;
import java.util.Random;
class ArrayRandomSum {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        numbers[0] = random.nextInt();
        numbers[1] = random.nextInt();
        numbers[2] = random.nextInt();
        System.out.println(numbers[0] + " + " + numbers[1] + " + " + numbers[2] + " = " + (numbers[0]+numbers[1]+numbers[2]));
    }

}
