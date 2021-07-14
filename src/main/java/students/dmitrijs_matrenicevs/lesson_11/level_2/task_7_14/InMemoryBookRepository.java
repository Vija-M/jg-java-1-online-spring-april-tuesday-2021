package students.dmitrijs_matrenicevs.lesson_11.level_2.task_7_14;

import java.util.HashSet;
import java.util.Set;

class InMemoryBookRepository {

    public static void main(String[] args) {

        Set<String> strings = new HashSet<>();
        strings.add("Book1");
        strings.add("Book2");
        strings.add("Book3");
        System.out.println(strings);
    }
}
