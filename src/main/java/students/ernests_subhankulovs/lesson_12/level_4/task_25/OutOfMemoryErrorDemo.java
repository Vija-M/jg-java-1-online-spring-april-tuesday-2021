package students.ernests_subhankulovs.lesson_12.level_4.task_25;

import java.util.ArrayList;
import java.util.List;

class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        while (true) {
            objectList.add(new Object());
            System.out.println("Current list size: " + objectList.size());
        }
    }
}
