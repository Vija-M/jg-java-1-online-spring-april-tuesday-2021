package instructor.lesson_12.exceptions;

import java.util.List;

class UnmodifiableCollectionDemo {

    public static void main(String[] args) {

        List<String> strings = List.of("hello", "world");
        strings.add("today");

    }
}
