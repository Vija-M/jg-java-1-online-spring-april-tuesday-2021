package students.dmitriy_shukailo.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Integer: " + list);

        System.out.println();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Integer: " + list);

        System.out.println();
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");
        list1.add("Hello");
        list1.add("World");
        System.out.println("String: " + list1);
    }

}