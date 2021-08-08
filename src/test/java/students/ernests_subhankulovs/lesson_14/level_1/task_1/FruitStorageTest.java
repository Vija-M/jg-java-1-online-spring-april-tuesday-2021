package students.ernests_subhankulovs.lesson_14.level_1.task_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitStorageTest {

    @Test
    void testGetAllGreenApplesListLength() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(3, fruitStorage.getAllGreenApples().size());
    }

    @Test
    void testGetAllGreenApples1stColor() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.getAllGreenApples().get(0).getColor());
    }

    @Test
    void testGetAllGreenApples1stWeight() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(200, fruitStorage.getAllGreenApples().get(0).getWeight());
    }

    @Test
    void testGetAllGreenApples2ndColor() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.getAllGreenApples().get(1).getColor());
    }

    @Test
    void testGetAllGreenApples2ndWeight() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(90, fruitStorage.getAllGreenApples().get(1).getWeight());
    }

    @Test
    void testGetAllGreenApples3rdColor() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.getAllGreenApples().get(2).getColor());
    }

    @Test
    void testGetAllGreenApples3rdWeight() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(50, fruitStorage.getAllGreenApples().get(2).getWeight());
    }
}