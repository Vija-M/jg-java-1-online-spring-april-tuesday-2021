package students.dmitrijs_matrenicevs.lesson_11.level_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Task1 {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("JAVA");
        strings.add("WORLD");
        strings.add("IT");

        System.out.println(strings);

        List<String> strings1 = new LinkedList<>();

        strings1.add("HELLO");
        strings1.add("BEST");
        strings1.add("GURU");

        System.out.println(strings1);
    }
    //ArrayList - следует использовать, когда в приоритете доступ по индексу, так как эти операции выполняются за константное время.
    //LinkedList - удобен когда важнее быстродействие операций вставки/удаления, которые в LinkedList выполняются за константное время.
}
