package instructor.lesson_5;

import java.util.Arrays;

class ArrayEqualDemo {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 5, 4};

        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        System.out.println("Arrays.toString(b) = " + Arrays.toString(b));
        System.out.println("Arrays.equals(a, b) = " + Arrays.equals(a, b));

    }
}
