package students.dmitriy_shukailo.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println("Integer: " + list);
        list.add(3);
        System.out.println("Integer: " + list);

        System.out.println();
        list.add(0, 0);
        System.out.println("Integer: " + list);
        list.add(0, -1);
        System.out.println("Integer: " + list);

        System.out.println();
        System.out.println("list.size: " + list.size());

        System.out.println();
        list.remove(0);
        System.out.println("Integer: " + list);
        list.removeAll(Arrays.asList(3));
        System.out.println("Integer: " + list);

        System.out.println();
        System.out.println("list.isEmpty: " + list.isEmpty());

        System.out.println();
        System.out.println("elements from list: ");
        for (Integer element : list) {
            System.out.println(element);
        }
    }

}