package students.arturs_arutjunovs.lesson_14.level_1.task_1_to_6;

import java.util.ArrayList;
import java.util.List;

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

    public List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
        List<Apple> filteredApples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

    public List<Apple> filterHeavyApples(List<Apple> inventory, int weight) {
        List<Apple> filteredApples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

    public List<Apple> filterLightApples(List<Apple> inventory, int weight) {
        List<Apple> filteredApples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() <= weight) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }
}