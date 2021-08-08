package students.ernests_subhankulovs.lesson_14.level_2.task_17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Apple> findApplesByColor(List<Apple> inventory, String color) {
        return inventory.stream().filter(s -> s.getColor()
                .equals(color))
                .collect(Collectors.toList());
    }

    public List<Apple> findApplesByWeight(List<Apple> inventory, int weight) {
        return inventory.stream()
                .filter(s -> s.getWeight() > weight)
                .collect(Collectors.toList());
    }

    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
