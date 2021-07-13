package students.ernests_subhankulovs.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

class Task4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element A");
        arrayList.add("Element A");
        System.out.println("ArrayList:");
        System.out.println(arrayList);
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Element A");
        linkedList.add("Element A");
        System.out.println("LinkedList:");
        System.out.println(linkedList);
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Element A");
        hashMap.put(1, "Element A");
        System.out.println("HashMap:");
        System.out.println(hashMap);
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element A");
        hashSet.add("Element A");
        System.out.println("HashSet:");
        System.out.println(hashSet);
    }
}
