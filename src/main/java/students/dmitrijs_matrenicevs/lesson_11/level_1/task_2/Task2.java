package students.dmitrijs_matrenicevs.lesson_11.level_1.task_2;

import java.util.ArrayList;
import java.util.List;

class Task2 {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        for (Integer integer : integers) {
            System.out.println(integers.get(integer - 1));
        }
    }
}
