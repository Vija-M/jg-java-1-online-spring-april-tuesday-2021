package students.linda_junkina.lesson_11.level_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ToDoList {
    public static void main(String[] args) {
        List<String> toDo = new LinkedList<>();

        toDo.add("do the dishes");
        toDo.add("cut the grass");
        toDo.add("cook a dinner");
        toDo.add("call grandma");

        System.out.println("List size: " + toDo.size());
        System.out.println(toDo);

        toDo.remove("cook a dinner");
        System.out.println("toDo = " + toDo);

        System.out.println();

        List<String> shopping = new ArrayList<>();
        shopping.add("apples");
        shopping.add("tomatoes");
        shopping.add("butter");
        shopping.add("fish");
        System.out.println("shopping = " + shopping);
    }
}
// существует 2 класса:
// ArrayList - устроен на индексах поэтому получить элементы будет быстрее
// LinkedList - удобнее добавлять, удалять или заменять элементы