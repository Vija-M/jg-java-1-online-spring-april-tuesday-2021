package students.vija_m.lesson_5.level_5.task_31_32;
import java.util.Random;
class Arrays {
    int generate(int length) {
        Random random = new Random();
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        return length;
    }

    public void printInfo() { System.out.println("Arrays.toString(numbers) = " + java.util.Arrays.toString(numbers));

    }
}