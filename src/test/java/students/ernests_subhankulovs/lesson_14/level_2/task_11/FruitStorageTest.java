package students.ernests_subhankulovs.lesson_14.level_2.task_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    void testFindApplesByWeightOver100Size() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        Assertions.assertEquals(apples.size(), fruitStorage.findApplesByWeight(fruitStorage.getAllApples(),100).size());
    }

    @Test
    void testFindApplesByWeightOver100Colors() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        for (int i = 0; i < apples.size(); i++) {
            Assertions.assertEquals(apples.get(i).getColor(), fruitStorage.findApplesByWeight(fruitStorage.getAllApples(),100).get(i).getColor());
        }
    }

    @Test
    void testFindApplesByWeightOver100Weights() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        for (int i = 0; i < apples.size(); i++) {
            Assertions.assertEquals(apples.get(i).getWeight(), fruitStorage.findApplesByWeight(fruitStorage.getAllApples(),100).get(i).getWeight());
        }
    }

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
    void testGetAllGreenApples2ndColorWithPredicate() {
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
    void testGetAllYellowApples1stColorWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("yellow", fruitStorage.findApples(fruitStorage.getAllApples(), new AppleYellowColorPredicate()).get(0).getColor());
    }

    @Test
    void testGetAllYellowApples1stWeightWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(50, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleYellowColorPredicate()).get(0).getWeight());

    }

    @Test
    void testGetAllYellowApples2ndColorWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("yellow", fruitStorage.findApples(fruitStorage.getAllApples(), new AppleYellowColorPredicate()).get(1).getColor());
    }

    @Test
    void testGetAllYellowApples2ndWeightWithPredicate() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(170, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleYellowColorPredicate()).get(1).getWeight());
    }

    @Test
    void testFindApplesByWeightOver150() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        for (int i = 0; i < apples.size(); i++) {
            Assertions.assertEquals(apples.get(i).getWeight(), fruitStorage.findApples(fruitStorage.getAllApples(), new AppleHeavyWeightPredicate()).get(i).getWeight());
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
        for (int i = 0; i < apples.size(); i++) {
            Assertions.assertEquals(apples.get(i).getWeight(), fruitStorage.findApples(fruitStorage.getAllApples(), new AppleLightWeightPredicate()).get(i).getWeight());
        }
    }

    @Test
    void testFindApplesByWeightOver150AndGreenColor() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals(200, fruitStorage.findApples(fruitStorage.getAllApples(), new AppleHeavyWeightGreenColorPredicate()).get(0).getWeight());
    }

    @Test
    void testFindApplesByGreenColorAndWeightOver150() {
        FruitStorage fruitStorage = new FruitStorage();
        Assertions.assertEquals("green", fruitStorage.findApples(fruitStorage.getAllApples(), new AppleHeavyWeightGreenColorPredicate()).get(0).getColor());
    }
}