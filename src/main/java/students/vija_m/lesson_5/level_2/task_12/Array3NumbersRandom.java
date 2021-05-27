package students.vija_m.lesson_5.level_2.task_12;
import java.util.Random;
class Array3NumbersRandom {
    public static void main(String[] args) {

    int[] numbers = new int[3];
        Random random = new Random();
        numbers[0] = random.nextInt();
        numbers[1] = random.nextInt();
        numbers[2] = random.nextInt();

        System.out.println("1st random number = " + numbers[0]);
        System.out.println("2nd random number = " + numbers[1]);
        System.out.println("3rd random number = " + numbers[2]);

}}
