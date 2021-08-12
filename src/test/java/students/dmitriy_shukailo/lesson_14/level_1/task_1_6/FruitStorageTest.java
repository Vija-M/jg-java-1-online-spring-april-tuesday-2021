package students.dmitriy_shukailo.lesson_14.level_1.task_1_6;

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
        assertEquals(expected, fruitStorage.findApplesByColor(inventory, "green"));
    }

    @Test
    public void findRedApples() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        assertEquals(expected, fruitStorage.findApplesByColor(inventory, "red"));
    }

    @Test
    public void findYellowApples() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("yellow", 50));
        expected.add(new Apple("yellow", 170));
        assertEquals(expected, fruitStorage.findApplesByColor(inventory, "yellow"));
    }

    @Test
    public void findHeavyApples() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        expected.add(new Apple("green", 200));
        expected.add(new Apple("yellow", 170));
        assertEquals(expected, fruitStorage.findApplesByHeavyWeight(inventory, 150));
    }

    @Test
    public void findLightApples() {

        List<Apple> inventory = fruitStorage.getAllApples();
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        expected.add(new Apple("yellow", 50));
        assertEquals(expected, fruitStorage.findApplesByLightWeight(inventory, 150));
    }

}


