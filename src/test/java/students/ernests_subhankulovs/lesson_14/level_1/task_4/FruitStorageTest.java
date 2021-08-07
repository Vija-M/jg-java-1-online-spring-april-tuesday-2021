package students.ernests_subhankulovs.lesson_14.level_1.task_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitStorageTest {

    @Test
    void testGetAllGreenApplesListLength() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(3, fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"green").size());
    }

    @Test
    void testGetAllGreenApples1stColor() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"green").get(0).getColor());
    }

    @Test
    void testGetAllGreenApples1stWeight() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(200, fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"green").get(0).getWeight());
    }

    @Test
    void testGetAllGreenApples2ndColor() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"green").get(1).getColor());
    }

    @Test
    void testGetAllGreenApples2ndWeight() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(90, fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"green").get(1).getWeight());
    }

    @Test
    void testGetAllGreenApples3rdColor() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"green").get(2).getColor());
    }

    @Test
    void testGetAllGreenApples3rdWeight() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(50, fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"green").get(2).getWeight());
    }

    @Test
    void testGetAllRedApplesListLength() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(3, fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"red").size());
    }

    @Test
    void testGetAllRedApples1stColor() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("red", fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"red").get(0).getColor());
    }

    @Test
    void testGetAllRedApples1stWeight() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(100, fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"red").get(0).getWeight());
    }

    @Test
    void testGetAllRedApples2ndColor() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("red", fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"red").get(1).getColor());
    }

    @Test
    void testGetAllRedApples2ndWeight() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(160, fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"red").get(1).getWeight());
    }

    @Test
    void testGetAllRedApples3rdColor() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("red", fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"red").get(2).getColor());
    }

    @Test
    void testGetAllRedApples3rdWeight() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(200, fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"red").get(2).getWeight());
    }
}