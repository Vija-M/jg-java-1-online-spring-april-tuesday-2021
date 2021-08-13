package students.vija_m.lesson_14.level_1.task_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FruitStorageTest {

    private final FruitStorage fruitStorage = new FruitStorage();

    @Test
    void testGetAllGreenApplesListLength() {
        Assertions.assertEquals(3, fruitStorage.findGreenApples(fruitStorage.getAllApples()).size());
    }

    @Test
    void testGetAllGreenApples1stColor() {

        Assertions.assertEquals("green", fruitStorage.findGreenApples(fruitStorage.getAllApples()).get(0).getColor());
    }

    @Test
    void testGetAllGreenApples1stWeight() {
        Assertions.assertEquals(200, fruitStorage.findGreenApples(fruitStorage.getAllApples()).get(0).getWeight());
    }

    @Test
    void testGetAllGreenApples2ndColor() {
        Assertions.assertEquals("green", fruitStorage.findGreenApples(fruitStorage.getAllApples()).get(1).getColor());
    }

    @Test
    void testGetAllGreenApples2ndWeight() {
        Assertions.assertEquals(90, fruitStorage.findGreenApples(fruitStorage.getAllApples()).get(1).getWeight());
    }

    @Test
    void testGetAllGreenApples3rdColor() {
        Assertions.assertEquals("green", fruitStorage.findGreenApples(fruitStorage.getAllApples()).get(2).getColor());
    }

    @Test
    void testGetAllGreenApples3rdWeight() {
        Assertions.assertEquals(50, fruitStorage.findGreenApples(fruitStorage.getAllApples()).get(2).getWeight());
    }

    @Test
    void testGetAllRedApplesListLength() {
        Assertions.assertEquals(3, fruitStorage.findRedApples(fruitStorage.getAllApples()).size());
    }

    @Test
    void testGetAllRedApples1stColor() {

        Assertions.assertEquals("red", fruitStorage.findRedApples(fruitStorage.getAllApples()).get(0).getColor());
    }

    @Test
    void testGetAllRedApples1stWeight() {
        Assertions.assertEquals(100, fruitStorage.findRedApples(fruitStorage.getAllApples()).get(0).getWeight());
    }

    @Test
    void testGetAllRedApples2ndColor() {
        Assertions.assertEquals("red", fruitStorage.findRedApples(fruitStorage.getAllApples()).get(1).getColor());
    }

    @Test
    void testGetAllRedApples2ndWeight() {
        Assertions.assertEquals(160, fruitStorage.findRedApples(fruitStorage.getAllApples()).get(1).getWeight());
    }

    @Test
    void testGetAllRedApples3rdColor() {
        Assertions.assertEquals("red", fruitStorage.findRedApples(fruitStorage.getAllApples()).get(2).getColor());
    }

    @Test
    void testGetAllRedApples3rdWeight() {
        Assertions.assertEquals(200, fruitStorage.findRedApples(fruitStorage.getAllApples()).get(2).getWeight());
    }


}






