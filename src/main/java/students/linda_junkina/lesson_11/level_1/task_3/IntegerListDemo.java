package students.linda_junkina.lesson_11.level_1.task_3;

import java.util.ArrayList;

class IntegerListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(0, 10);
        numbers.add(1, 9);
        numbers.add(2, 4);
        numbers.add(3, 12);
        numbers.remove(0);
        numbers.remove((Integer) 4);
        System.out.println(numbers.isEmpty());
        System.out.println(numbers);
    }
}
