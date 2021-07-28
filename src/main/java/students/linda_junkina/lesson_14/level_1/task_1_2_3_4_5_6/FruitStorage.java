package students.linda_junkina.lesson_14.level_1.task_1_2_3_4_5_6;

import java.util.ArrayList;
import java.util.List;

class FruitStorage {
    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

//    public List <Apple> getGreenApples(List<Apple>inventory){
//
//
//    }
}
