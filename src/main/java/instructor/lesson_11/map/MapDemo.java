package instructor.lesson_11.map;

import java.util.HashMap;
import java.util.Map;

class MapDemo {

    public static void main(String[] args) {

        Map<String, Integer> wordCount = new HashMap<>();

        System.out.println(wordCount);
        System.out.println("wordCount.isEmpty() = " + wordCount.isEmpty());
        System.out.println("wordCount.size() = " + wordCount.size());

        wordCount.put("mango", 10);
        wordCount.put("put", 3);
        wordCount.put("today", 7);
        wordCount.put("weather", 0);
        wordCount.put("mango", 1337);

        System.out.println();
        System.out.println(wordCount);
        System.out.println("wordCount.isEmpty() = " + wordCount.isEmpty());
        System.out.println("wordCount.size() = " + wordCount.size());

        System.out.println("wordCount.get(\"mango\") = " + wordCount.get("mango"));
        System.out.println("wordCount.get(\"weather\") = " + wordCount.get("weather"));

        System.out.println("wordCount.containsKey(\"today\") = " + wordCount.containsKey("today"));
        System.out.println("wordCount.containsKey(\"tomorrow\") = " + wordCount.containsKey("tomorrow"));

        System.out.println("wordCount.containsValue(10) = " + wordCount.containsValue(10));
        System.out.println("wordCount.containsValue(5) = " + wordCount.containsValue(5));

        wordCount.remove("put");

        System.out.println();
        System.out.println(wordCount);
        System.out.println("wordCount.isEmpty() = " + wordCount.isEmpty());
        System.out.println("wordCount.size() = " + wordCount.size());

        wordCount.clear();

        System.out.println();
        System.out.println(wordCount);
        System.out.println("wordCount.isEmpty() = " + wordCount.isEmpty());
        System.out.println("wordCount.size() = " + wordCount.size());

    }
}
