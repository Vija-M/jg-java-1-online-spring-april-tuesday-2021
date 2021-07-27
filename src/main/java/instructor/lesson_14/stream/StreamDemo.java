package instructor.lesson_14.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class StreamDemo {

    public static void main(String[] args) {

        List<String> strings = List.of("javaguru", "foo", "ipsum", "bar", "hello", "lorem", "baz", "world");

        System.out.println(strings);

        List<String> transformedWithLoops = filterAndTransform(strings);

        List<String> transformedWithStream = strings.stream()
                .filter(s -> s.length() > 3)
                .map(String::toUpperCase)
                .collect(toList());

        System.out.println("transformedWithLoops  = " + transformedWithLoops);
        System.out.println("transformedWithStream = " + transformedWithStream);

    }

    private static List<String> filterAndTransform(List<String> strings) {
        List<String> list = new ArrayList<>();

        for (String string : strings) {
            if (string.length() > 3) {
                list.add(string.toUpperCase());
            }
        }

        return list;
    }
}
