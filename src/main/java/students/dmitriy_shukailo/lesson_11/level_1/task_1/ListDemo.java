package students.dmitriy_shukailo.lesson_11.level_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListDemo {

    public static void main(String[] args) {

        List<String> listA = new ArrayList<>();

        listA.add("Hello");
        listA.add("World");
        listA.add("!");

        System.out.println("ArrayList: " + listA);

        List<String> listL = new LinkedList<>();
        listL.add("I");
        listL.add("am");
        listL.add("is");
        listL.add("...");

        System.out.println("LinkedList: " + listL);
    }

}

/*
Cуществует две реализации java.util.List:
ArrayList - на основе массива
LinkedList - на основе двусвязного списка

Основное техническое отличие ArrayList от LinkedList состоит в том,
что ArrayList использует native методы для увеличения размера,
в то время как LinkedList полностью написана на Java.

Производительность LinkedList для add() и remove() лучше, чем у Arraylist.
А вот get() и set() методы имеют худшую производительность, чем у ArrayList,
так как LinkedList не обеспечивает прямого доступа к своим членам.
 */