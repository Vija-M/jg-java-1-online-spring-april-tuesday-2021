package students.linda_junkina.lesson_14.level_2.task_7_8_9_10_11_12_13_14_15_16_17;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FruitStorageTest {
    private final FruitStorage fruitStorage = new FruitStorage();

    @Test
    void findGreenApples() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        assertEquals(expected, fruitStorage.findApples(inventory, (new AppleGreenColorPredicate())));
    }

    @Test
    void findRedApples() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        assertEquals(expected, fruitStorage.findApples(inventory, (new AppleRedColorPredicate())));
    }

    @Test
    void findHeavyApples() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        expected.add(new Apple("green", 200));
        expected.add(new Apple("yellow", 170));
        assertEquals(expected, fruitStorage.findApples(inventory, (new AppleHeavyPredicate())));
    }

    @Test
    void findLightApples() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        expected.add(new Apple("yellow", 50));
        assertEquals(expected, fruitStorage.findApples(inventory, (new AppleLightPredicate())));
    }

    @Test
    void findGreenAndHeavyApples() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        assertEquals(expected, fruitStorage.findApples(inventory, (new AppleGreenAndHeavyPredicate())));
    }
}