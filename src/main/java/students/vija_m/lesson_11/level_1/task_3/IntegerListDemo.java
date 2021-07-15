package students.vija_m.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);
        numbers.add(8);
        numbers.add(4);
        numbers.add(3);
        System.out.println(numbers);

        numbers.add(0, -196);
        numbers.add(numbers.size(), 57896);
        System.out.println(numbers);

        System.out.println("ArrayList numbers size is: " + numbers.size());

        numbers.remove(2);
        numbers.remove(Integer.valueOf(4));
        numbers.remove((Integer) 8);
        System.out.println(numbers);

        System.out.println("Is our array empty? : " + numbers.isEmpty());

        for (Integer i : numbers) {
            System.out.println(i);
        }
    }
}
