package instructor.lesson_11.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListDemo {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        System.out.println(strings);

        System.out.println("strings.size() = " + strings.size());
        System.out.println("strings.isEmpty() = " + strings.isEmpty());

        strings.add("Hello");
        strings.add("World");
        strings.add("Today");
        strings.add("Is a");
        strings.add("Great");
        strings.add("Day");

        System.out.println();
        System.out.println(strings);

        System.out.println("strings.size() = " + strings.size());
        System.out.println("strings.isEmpty() = " + strings.isEmpty());

        System.out.println("strings.get(3) = " + strings.get(3));

        strings.add(3, "And");

        System.out.println();
        System.out.println(strings);

        System.out.println("strings.size() = " + strings.size());
        System.out.println("strings.get(3) = " + strings.get(3));

        strings.remove("And");

        System.out.println();
        System.out.println(strings);
        System.out.println("strings.size() = " + strings.size());
        System.out.println("strings.get(3) = " + strings.get(3));

        System.out.println("strings.contains(\"Hello\") = " + strings.contains("Hello"));
        System.out.println("strings.contains(\"hello\") = " + strings.contains("hello"));

        strings.clear();

        System.out.println();
        System.out.println(strings);
        System.out.println("strings.size() = " + strings.size());
        System.out.println("strings.isEmpty() = " + strings.isEmpty());

    }
}
