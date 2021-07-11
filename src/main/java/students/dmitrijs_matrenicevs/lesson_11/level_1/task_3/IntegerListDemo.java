package students.dmitrijs_matrenicevs.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.Collections;

class IntegerListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        System.out.println(integers);
        integers.add(3);
        System.out.println(integers);
        integers.add(0,0);
        System.out.println(integers);
        integers.add(0,-1);
        System.out.println(integers);
        integers.remove(0);
        System.out.println(integers);
        integers.removeAll(Collections.singletonList(3));
        System.out.println(integers);
        System.out.println(integers.isEmpty());
        for (Integer ignored : integers) {
            System.out.println(integers);
        }
    }
}
