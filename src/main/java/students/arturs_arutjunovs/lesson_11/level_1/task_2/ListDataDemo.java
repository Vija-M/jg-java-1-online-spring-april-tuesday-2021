package students.arturs_arutjunovs.lesson_11.level_1.task_2;
//java.util.List хранит ссылочные типы, ссылки на объекты, а для хранения примитивных данных
// используются их ссылочные версии(классы-обёртки)

import java.util.ArrayList;
import java.util.List;

class ListDataDemo {
    public static void main(String[] args) {

        List<String> myStringList = new ArrayList<>();

        myStringList.add("Point A");
        myStringList.add("Point B");
        myStringList.add("Point C");
        System.out.println(myStringList);

        List<Integer> myIntList = new ArrayList<>(); //Integer

        myIntList.add(1);
        myIntList.add(2);
        myIntList.add(3);
        System.out.println(myIntList);
    }
}

