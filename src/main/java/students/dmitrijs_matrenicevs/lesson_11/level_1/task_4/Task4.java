package students.dmitrijs_matrenicevs.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

class Task4 {
    //хранить дубликаты можно
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("HELLO");
        strings.add("WORLD");
        strings.add("HELLO");
        System.out.println(strings);
    }
}
