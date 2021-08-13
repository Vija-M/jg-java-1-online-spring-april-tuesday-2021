package students.vija_m.lesson_14.level_1.task_1;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.*;

class FruitStorage {
    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> findGreenApples() {
        return getAllApples().stream()
                .filter(s -> s.getColor().equals("green"))
                .collect(toList());
    }

    /*     public List<Apple> findGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for ( Apple apple : inventory ) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }     */
}

