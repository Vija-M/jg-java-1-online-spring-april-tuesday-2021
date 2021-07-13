package students.vija_m.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesAllowed {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(8);
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);
        numbers.add(0, 8);
        numbers.add(numbers.size(), 8);
        System.out.println("ArrayList is: " + numbers + ". ArrayList length is: " + numbers.size());
    }
}


