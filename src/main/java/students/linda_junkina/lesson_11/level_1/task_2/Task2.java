package students.linda_junkina.lesson_11.level_1.task_2;

import java.util.ArrayList;
import java.util.List;

class Task2 {
    // java.util.List может хранить только ссылки на объекты
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bill");
        names.add("Mike");
        System.out.println("names = " + names);
    }
}
