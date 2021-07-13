package students.ernests_subhankulovs.lesson_11.level_1.task_1;

import java.util.*;

class Task1 {
    public static void main(String[] args) {
        arrayListDemo();
        linkedListDemo();
        hashMapDemo();
        hashSetDemo();
    }

    private static void arrayListDemo() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element A");
        arrayList.add("Element B");
        arrayList.add("Element C");
        arrayList.add("Element C");
        System.out.println("ArrayList demo:");
        System.out.println("Element with index 0: " + arrayList.get(0));
        System.out.println("Element with index 1: " + arrayList.get(1));
        System.out.println("Element with index 2: " + arrayList.get(2));
        System.out.println("Element with index 3: " + arrayList.get(3));
        System.out.println("-----");
        arrayList.remove(1);
        System.out.println("Element with index 1 is now removed.");
        System.out.println("-----");
        int i = 0;
        for (String element : arrayList) {
            System.out.println("Element with index " + i + ": " + element);
            i++;
        }
        System.out.println();
        System.out.println("It is a resizable array, also called a dynamic array\n" +
                "‣ It internally uses an array to store the elements\n" +
                "‣ It allows duplicate values\n" +
                "‣ It is an ordered collection\n" +
                "‣ It can store only non-primitive values");
        System.out.println();
    }

    private static void linkedListDemo() {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Element A");
        linkedList.add("Element B");
        linkedList.add("Element C");
        linkedList.add("Element C");
        System.out.println("ArrayList demo:");
        System.out.println("Element with index 0: " + linkedList.get(0));
        System.out.println("Element with index 1: " + linkedList.get(1));
        System.out.println("Element with index 2: " + linkedList.get(2));
        System.out.println("Element with index 3: " + linkedList.get(3));
        System.out.println("-----");
        linkedList.remove(1);
        System.out.println("Element with index 1 is now removed.");
        System.out.println("-----");
        int i = 0;
        for (String element : linkedList) {
            System.out.println("Element with index " + i + ": " + element);
            i++;
        }
        System.out.println();
        System.out.println("ArrayList is usually slower, because the elements in the ArrayList needs to be shifted if\n" +
                "element is added or removed in the middle (capacity changes matter as well)");
        System.out.println("LinkedList is faster because only references must be changed");
    }

    private static void hashMapDemo() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Element A");
        hashMap.put(2, "Element B");
        hashMap.put(3, "Element C");
        hashMap.put(4, "Element D");
        System.out.println();
        System.out.println("HashMap demo:");
        System.out.println(hashMap);
        System.out.println("-----");
        System.out.println("Internally uses ArrayList (with buckets as elements) and\n" +
                "each bucket contains LinkedList\n" +
                "▸ It doesn't allow duplicate keys\n" +
                "▸ It allows single null key and multiple null values\n" +
                "▸ It is an unordered collection\n" +
                "▸ It can store only non-primitive values");
    }

    private static void hashSetDemo() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element A");
        hashSet.add("Element B");
        hashSet.add("Element C");
        System.out.println();
        System.out.println("HashSet demo:");
        System.out.println(hashSet);
        System.out.println("-----");
        System.out.println("Internally uses HashMap to store its elements\n" +
                "▸ It doesn't allow duplicate values\n" +
                "▸ It allows single null value\n" +
                "▸ It is an unordered collection\n" +
                "▸ It can store only non-primitive values");
    }
}
