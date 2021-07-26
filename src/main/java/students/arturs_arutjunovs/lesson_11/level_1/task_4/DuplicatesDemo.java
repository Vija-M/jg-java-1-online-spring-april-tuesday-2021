package students.arturs_arutjunovs.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

class DuplicatesDemo {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(0, 2);
        integerList.add(1, 2);
        integerList.add(2, 2);
        System.out.println(integerList);

        List<String> stringList = new ArrayList<>();

        stringList.add(0, "Java");
        stringList.add(0, "Java");
        stringList.add(2, "Guru");
        stringList.add(3, "Guru");
        System.out.println(stringList);

    }
}
