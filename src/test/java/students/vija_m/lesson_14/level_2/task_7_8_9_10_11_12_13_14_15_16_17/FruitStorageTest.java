package students.vija_m.lesson_14.level_2.task_7_8_9_10_11_12_13_14_15_16_17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FruitStorageTest {

    @Test
    void testGetAllGreenApples1stColorWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.findApples(fruitStorage.getAllApples(), new AppleGreenColorPredicate()).get(0).getColor());
    }

    @Test
    void testGetAllGreenApples1stWeightWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(200, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleGreenColorPredicate()).get(0).getWeight());
    }

    @Test
    void testGetAllGreenApples2rdColorWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.findApples(fruitStorage.getAllApples(), new AppleGreenColorPredicate()).get(1).getColor());
    }


    @Test
    void testGetAllGreenApples2ndWeightWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(90, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleGreenColorPredicate()).get(1).getWeight());
    }

    @Test
    void testGetAllGreenApples3rdColorWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.findApples(fruitStorage.getAllApples(), new AppleGreenColorPredicate()).get(2).getColor());
    }

    @Test
    void testGetAllGreenApples3rdWeightWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(50, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleGreenColorPredicate()).get(2).getWeight());
    }

    @Test
    void testGetAllRedApples1stColorWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("red", fruitStorage.findApples(fruitStorage.getAllApples(), new AppleRedColorPredicate()).get(0).getColor());
    }

    @Test
    void testGetAllRedApples1stWeightWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(100, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleRedColorPredicate()).get(0).getWeight());

    }

    @Test
    void testGetAllRedApples2ndColorWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("red", fruitStorage.findApples(fruitStorage.getAllApples(), new AppleRedColorPredicate()).get(1).getColor());
    }

    @Test
    void testGetAllRedApples2ndWeightWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(160, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleRedColorPredicate()).get(1).getWeight());
    }

    @Test
    void testGetAllRedApples3rdColorWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("red", fruitStorage.findApples(fruitStorage.getAllApples(), new AppleRedColorPredicate()).get(2).getColor());
    }

    @Test
    void testGetAllRedApples3rdWeightWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(200, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleRedColorPredicate()).get(2).getWeight());
    }

    @Test
    void testFindApplesByWeightOver150() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        for ( int i = 0; i < apples.size(); i++ ) {
            Assertions.assertEquals(apples.get(i).getWeight(), fruitStorage.findApples(fruitStorage.getAllApples(), new AppleHeavyPredicate()).get(i).getWeight());
        }
    }

    @Test
    void testFindApplesByWeightLessThan150() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        for ( int i = 0; i < apples.size(); i++ ) {
            Assertions.assertEquals(apples.get(i).getWeight(), fruitStorage.findApples(fruitStorage.getAllApples(), new AppleLightPredicate()).get(i).getWeight());
        }
    }

    @Test
    void testWeightFindGreenApplesByWeightOver150() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(200, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleGreenColorHeavyPredicate()).get(0).getWeight());
    }

    @Test
    void testColorFindGreenApplesByWeightOver150() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.findApples(fruitStorage.getAllApples(), new AppleGreenColorHeavyPredicate()).get(0).getColor());
    }


    @Test
    void testGetAllRedApples1stColorAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("red", fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "red".equals(apple.getColor())).get(0).getColor());
    }

    @Test
    void testGetAllRedApples1stWeightAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(100, fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "red".equals(apple.getColor())).get(0).getWeight());
    }

    @Test
    void testGetAllRedApples2ndColorAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("red", fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "red".equals(apple.getColor())).get(1).getColor());
    }

    @Test
    void testGetAllRedApples2ndWeightAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(160, fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "red".equals(apple.getColor())).get(1).getWeight());
    }

    @Test
    void testGetAllRedApples3rdColorAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("red", fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "red".equals(apple.getColor())).get(2).getColor());
    }

    @Test
    void testGetAllRedApples3rdWeightAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(200, fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "red".equals(apple.getColor())).get(2).getWeight());
    }

    @Test
    void testGetAllGreenApplesSizeAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(3, fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "green".equals(apple.getColor())).size());
    }

    @Test
    void testGetAllGreenApples1stColorAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "green".equals(apple.getColor())).get(0).getColor());
    }

    @Test
    void testGetAllGreenApples1stWeightAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(200, fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "green".equals(apple.getColor())).get(0).getWeight());
    }

    @Test
    void testGetAllGreenApples2ndColorAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "green".equals(apple.getColor())).get(1).getColor());
    }

    @Test
    void testGetAllGreenApples2ndWeightAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(90, fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "green".equals(apple.getColor())).get(1).getWeight());
    }

    @Test
    void testGetAllGreenApples3rdColorAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "green".equals(apple.getColor())).get(2).getColor());
    }

    @Test
    void testGetAllGreenApples3rdWeightAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(50, fruitStorage.findApples(fruitStorage.getAllApples(), apple -> "green".equals(apple.getColor())).get(2).getWeight());
    }

    @Test
    void testFindApplesByWeightOver150AnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        for ( int i = 0; i < apples.size(); i++ ) {
            Assertions.assertEquals(apples.get(i).getWeight(), fruitStorage.findApples(fruitStorage.getAllApples(), apple -> apple.getWeight() > 150).get(i).getWeight());
        }
    }

    @Test
    void testFindApplesByWeightLessThan150AnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        for ( int i = 0; i < apples.size(); i++ ) {
            Assertions.assertEquals(apples.get(i).getWeight(), fruitStorage.findApples(fruitStorage.getAllApples(), apple -> apple.getWeight() < 150).get(i).getWeight());
        }
    }
}

