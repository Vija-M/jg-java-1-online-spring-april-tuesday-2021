package students.ernests_subhankulovs.lesson_11.level_1.task_3;

import java.util.ArrayList;

class IntegerListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        System.out.println("Initial integer list: " + integerList);
        integerList.add(1);
        System.out.println("Integer list after adding an element: " + integerList);
        System.out.println("Integer list size: " + integerList.size());
        integerList.add(2);
        integerList.add(3);
        System.out.println("Integer list after adding 2 more elements: " + integerList);
        integerList.remove(2);
        System.out.println("Integer list after removing the 2nd element by index: " + integerList);
        integerList.remove(Integer.valueOf(2));
        System.out.println("Integer list after removing the element by value \"2\": " + integerList);
        integerList.add(2);
        integerList.add(3);
        System.out.println("2 elements are added to the list");
        System.out.println("All elements currently in the list:");
        int i = 0;
        for (Integer element: integerList) {
            System.out.println("Element #" + i + " = " + element);
            i++;
        }
    }
}
