package students.arturs_arutjunovs.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {

        List<Integer> listOfInts = new ArrayList<>();

        listOfInts.add(0, 100);
        listOfInts.add(1, 200);
        listOfInts.add(2, 300);
        listOfInts.add(3, 400);
        listOfInts.add(4, 500);
        System.out.println("List of int numbers: " + listOfInts);
        System.out.println();

        listOfInts.add(0, 50);
        System.out.println("Add element at the beginning: " + listOfInts);
        System.out.println();

        listOfInts.add(6, 600);
        System.out.println("Add element at the end: " + listOfInts);
        System.out.println("The length of list: " + listOfInts.size());
        System.out.println();

        listOfInts.remove(2);
        System.out.println("Removed element with index 2: " + listOfInts);
        System.out.println();

        listOfInts.removeAll(Arrays.asList(600));
        System.out.println("Removed element by object: " + listOfInts);
        System.out.println("listIsEmpty = " + listOfInts.isEmpty());
        System.out.println();

        System.out.print("List of int numbers: ");
        for (Integer listOfIntNumber : listOfInts) {
            System.out.print(listOfIntNumber + " ");
        }
    }
}
