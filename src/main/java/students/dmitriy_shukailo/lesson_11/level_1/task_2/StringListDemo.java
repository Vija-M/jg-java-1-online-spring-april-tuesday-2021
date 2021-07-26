package students.dmitriy_shukailo.lesson_11.level_1.task_2;

import java.util.ArrayList;
import java.util.List;

class StringListDemo {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");
        list1.add("!");
        System.out.println("String: " + list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("Integer: " + list2);
    }

}

/*
Java.util.List может хранить ссылочные типы, любые объекты, включая сторонние классы.
Для хранения примитивных типов данных используются классы-обертки.
 */