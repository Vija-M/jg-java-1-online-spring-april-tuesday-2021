package students.vija_m.lesson_14.level_1.task_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FruitStorageTest {
    private final FruitStorage fruitStorage = new FruitStorage();

    @Test
    void testGetAllGreenApplesListLength() {
        Assertions.assertEquals(3, fruitStorage.findGreenApples().size());
    }

    @Test
    void testGetAllGreenApples1stColor() {
        Assertions.assertEquals("green", fruitStorage.findGreenApples().get(0).getColor());
    }

    @Test
    void testGetAllGreenApples1stWeight() {
        Assertions.assertEquals(200, fruitStorage.findGreenApples().get(0).getWeight());
    }

    @Test
    void testGetAllGreenApples2ndColor() {
        Assertions.assertEquals("green", fruitStorage.findGreenApples().get(1).getColor());
    }

    @Test
    void testGetAllGreenApples2ndWeight() {
        Assertions.assertEquals(90, fruitStorage.findGreenApples().get(1).getWeight());
    }

    @Test
    void testGetAllGreenApples3rdColor() {
        Assertions.assertEquals("green", fruitStorage.findGreenApples().get(2).getColor());
    }

    @Test
    void testGetAllGreenApples3rdWeight() {
        Assertions.assertEquals(50, fruitStorage.findGreenApples().get(2).getWeight());
    }
}