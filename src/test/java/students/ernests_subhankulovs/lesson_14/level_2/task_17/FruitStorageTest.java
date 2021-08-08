package students.ernests_subhankulovs.lesson_14.level_2.task_17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FruitStorageTest {

    @Test
    void testGetAllRedApplesSizeWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(3, fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "red".equals(apple.getColor())).size());
    }

    @Test
    void testGetAllRedApples1stColorWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("red", fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "red".equals(apple.getColor())).get(0).getColor());
    }

    @Test
    void testGetAllRedApples1stWeightWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(100, fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "red".equals(apple.getColor())).get(0).getWeight());
    }

    @Test
    void testGetAllRedApples2ndColorWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("red", fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "red".equals(apple.getColor())).get(1).getColor());
    }

    @Test
    void testGetAllRedApples2ndWeightWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(160, fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "red".equals(apple.getColor())).get(1).getWeight());
    }

    @Test
    void testGetAllRedApples3rdColorWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("red", fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "red".equals(apple.getColor())).get(2).getColor());
    }

    @Test
    void testGetAllRedApples3rdWeightWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(200, fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "red".equals(apple.getColor())).get(2).getWeight());
    }

    @Test
    void testGetAllGreenApplesSizeWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(3, fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "green".equals(apple.getColor())).size());
    }

    @Test
    void testGetAllGreenApples1stColorWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "green".equals(apple.getColor())).get(0).getColor());
    }

    @Test
    void testGetAllGreenApples1stWeightWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(200, fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "green".equals(apple.getColor())).get(0).getWeight());
    }

    @Test
    void testGetAllGreenApples2ndColorWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "green".equals(apple.getColor())).get(1).getColor());
    }

    @Test
    void testGetAllGreenApples2ndWeightWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(90, fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "green".equals(apple.getColor())).get(1).getWeight());
    }

    @Test
    void testGetAllGreenApples3rdColorWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "green".equals(apple.getColor())).get(2).getColor());
    }

    @Test
    void testGetAllGreenApples3rdWeightWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(50, fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "green".equals(apple.getColor())).get(2).getWeight());
    }

    @Test
    void testFindApplesByWeightOver150WithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        for (int i = 0; i < apples.size(); i++) {
            Assertions.assertEquals(apples.get(i).getWeight(), fruitStorage.findApples(fruitStorage.getAllApples(), apple -> apple.getWeight() > 150).get(i).getWeight());
        }
    }

    @Test
    void testFindApplesByWeightLessThan150WithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        for (int i = 0; i < apples.size(); i++) {
            Assertions.assertEquals(apples.get(i).getWeight(), fruitStorage.findApples(fruitStorage.getAllApples(), apple -> apple.getWeight() < 150).get(i).getWeight());
        }
    }
}