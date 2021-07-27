package instructor.lesson_14.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

class MostFrequentWordStreamDemo {

    public static void main(String[] args) {

        String text = "foo bar baz hello java foo world java baz foo lorem bar ipsum java foo world";

        Map<String, Long> wordCountMap = Arrays.stream(text.split(" "))
                .collect(groupingBy(identity(), counting()));

        System.out.println(wordCountMap);

        Optional<String> mostFrequentWord = wordCountMap.entrySet().stream()
//                .filter(e -> false)
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);

//        System.out.println(mostFrequentWord.orElseThrow(NoSuchElementException::new));

        mostFrequentWord.ifPresent(System.out::println);

    }
}
