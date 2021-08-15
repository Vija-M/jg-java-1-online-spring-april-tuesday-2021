package students.dmitriy_shukailo.lesson_14.level_2.task_7_17;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FruitStorageTest {

    private final FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void findGreenApples() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        assertEquals(expected, fruitStorage.findApples(inventory, new AppleGreenColorPredicate()));
    }

    @Test
    public void findRedApples() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        assertEquals(expected, fruitStorage.findApples(inventory, new AppleRedColorPredicate()));
    }

    @Test
    public void findYellowApples() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("yellow", 50));
        expected.add(new Apple("yellow", 170));
        assertEquals(expected, fruitStorage.findApples(inventory, new AppleYellowColorPredicate()));
    }

    @Test
    public void findHeavyApples() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        expected.add(new Apple("green", 200));
        expected.add(new Apple("yellow", 170));
        assertEquals(expected, fruitStorage.findApples(inventory, new AppleHeavyWeightPredicate()));
    }

    @Test
    public void findLightApples() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        expected.add(new Apple("yellow", 50));
        assertEquals(expected, fruitStorage.findApples(inventory, new AppleLightWeightPredicate()));
    }

    @Test
    public void findHeavyAndGreenAplles() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        assertEquals(expected, fruitStorage.findApples(inventory, new AppleHeavyWeightAndGreenColorPredicate()));
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
    public void filterYellowApples() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> yellowApples = fruitStorage.findApples(inventory, (Apple apple) -> "yellow".equals(apple.getColor()));
    }

    @Test
    public void filterHeavyApples() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> heavyApples = fruitStorage.findApples(inventory, (Apple apple) -> apple.getWeight() > 150);
    }

    @Test
    public void filterLightApples() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> lightApples = fruitStorage.findApples(inventory, (Apple apple) -> apple.getWeight() < 150);
    }

}

