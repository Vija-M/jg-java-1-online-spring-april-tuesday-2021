package students.vija_m.lesson_11.level_1.task_2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        //java.util.List может хранить только ссылки на объекты!
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);
        numbers.add(-196);
        System.out.println(numbers);
    }
}
