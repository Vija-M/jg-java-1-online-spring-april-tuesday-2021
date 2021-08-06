package students.dmitrijs_matrenicevs.lesson_14.level_2.task_7_17;

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

    public List<Apple> findColorApples(List<Apple> inventory, String color) {
        List<Apple> result;
        result = new ArrayList<>();
        inventory.stream().filter(apple -> apple.getColor().equals(color)).forEach(result::add);
        return result;
    }

    public List<Apple> findApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result;
        result = new ArrayList<>();
        inventory.stream().filter(apple -> apple.getWeight() > weight).forEach(result::add);
        return result;
    }

    public List<Apple> findFilterApples(List<Apple> inventory, int weight) {
        List<Apple> result;
        result = new ArrayList<>();
        inventory.stream().filter(apple -> apple.getWeight() <= weight).forEach(result::add);
        return result;
    }

    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result;
        result = new ArrayList<>();
        inventory.stream().filter(p::test).forEach(result::add);
        return result;
    }
}