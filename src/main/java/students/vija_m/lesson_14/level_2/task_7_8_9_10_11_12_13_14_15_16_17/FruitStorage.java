package students.vija_m.lesson_14.level_2.task_7_8_9_10_11_12_13_14_15_16_17;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

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

    public List<Apple> getApplesByColor(List<Apple> inventory, String color) {
        return getAllApples().stream()
                .filter(s -> s.getColor().equals(color))
                .collect(toList());
    }

    public List<Apple> getApplesByWeight(List<Apple> inventory, int weight) {
        return getAllApples().stream()
                .filter(s -> s.getWeight() > weight)
                .collect(toList());
    }

    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for ( Apple apple : inventory ) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
