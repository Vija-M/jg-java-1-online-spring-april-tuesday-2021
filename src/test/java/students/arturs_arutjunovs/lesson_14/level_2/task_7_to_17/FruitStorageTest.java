package students.arturs_arutjunovs.lesson_14.level_2.task_7_to_17;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FruitStorageTest {
    FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void findRedApples() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        assertEquals(expected, fruitStorage.findApples(inventory, new RedApplesPredicate()));
    }

    @Test
    public void findGreenApples() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        assertEquals(expected, fruitStorage.findApples(inventory, new GreenApplesPredicate()));
    }

    @Test
    public void findHeavyApples() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        expected.add(new Apple("green", 200));
        expected.add(new Apple("yellow", 170));
        assertEquals(expected, fruitStorage.findApples(inventory, new HeavyApplesPredicate()));
    }

    @Test
    public void findLightApples() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        expected.add(new Apple("yellow", 50));
        assertEquals(expected, fruitStorage.findApples(inventory, new LightApplesPredicate()));
    }

    @Test
    public void findGreenAndHeavyApples() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        assertEquals(expected, fruitStorage.findApples(inventory, new AppleGreenAndHeavyWeightPredicate()));
    }

    @Test
    public void filterRedApples() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> redApples = fruitStorage.findApples(inventory, (Apple apple) -> "red".equals(apple.getColor()));
    }

    @Test
    public void filterGreenApples() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> greenApples = fruitStorage.findApples(inventory, (Apple apple) -> "green".equals(apple.getColor()));
    }

    @Test
    public void filterHeavyApples() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> heavyApples = fruitStorage.findApples(inventory, (Apple apple) -> apple.getWeight() > 150);
    }

    @Test
    public void filterLightApples() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> lightApples = fruitStorage.findApples(inventory, (Apple apple) -> apple.getWeight() <= 150);
    }

    @Test
    public void filterGreenAndHeavyApples() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> greenAndHeavyApples = fruitStorage.findApples(inventory, new AppleGreenAndHeavyWeightPredicate());
    }
}
