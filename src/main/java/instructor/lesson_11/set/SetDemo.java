package instructor.lesson_11.set;

import java.util.HashSet;
import java.util.Set;

class SetDemo {

    public static void main(String[] args) {

        Set<String> strings = new HashSet<>();

        System.out.println(strings);
        System.out.println("strings.isEmpty() = " + strings.isEmpty());
        System.out.println("strings.size() = " + strings.size());

        strings.add("hello");
        strings.add("world");
        strings.add("world");
        strings.add("hello");
        strings.add("today");
        strings.add("hello");

        System.out.println();
        System.out.println(strings);
        System.out.println("strings.isEmpty() = " + strings.isEmpty());
        System.out.println("strings.size() = " + strings.size());
                
    }
}
