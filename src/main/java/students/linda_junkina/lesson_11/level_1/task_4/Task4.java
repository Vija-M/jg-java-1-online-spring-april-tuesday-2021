package students.linda_junkina.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

class Task4 {
    // список может хранить дубликаты
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("elephant");
        animals.add("giraffe");
        animals.add("elephant");
        System.out.println("animals = " + animals);
    }
}

