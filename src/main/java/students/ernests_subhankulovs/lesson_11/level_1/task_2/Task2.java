package students.ernests_subhankulovs.lesson_11.level_1.task_2;

import java.util.*;

class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        for (Integer i : arrayList) {
            System.out.println("Element with index " + (i - 1) + ": " + arrayList.get(i - 1));
        }
    }
}
