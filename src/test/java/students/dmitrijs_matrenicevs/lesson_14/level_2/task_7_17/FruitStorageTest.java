package students.dmitrijs_matrenicevs.lesson_14.level_2.task_7_17;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FruitStorageTest {

    private final FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void redApplesTest() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        assertEquals(expected, fruitStorage.findColorApples(inventory, "red"));
    }

    @Test
    public void greenApplesTest() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        assertEquals(expected, fruitStorage.findColorApples(inventory, "green"));
    }

    @Test
    public void findWFilterApplesTest() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        expected.add(new Apple("green", 200));
        expected.add(new Apple("yellow", 170));
        assertEquals(expected, fruitStorage.findApplesByWeight(inventory, 150));
    }

    @Test
    public void findFilterApplesTest() {
        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        expected.add(new Apple("yellow", 50));
        assertEquals(expected, fruitStorage.findFilterApples(inventory, 150));
    }

}