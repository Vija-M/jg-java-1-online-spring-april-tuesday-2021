package instructor.lesson_10.comparator;

import java.util.Arrays;

class ComparatorDemo {

    public static void main(String[] args) {

//        int[] ints = {2, 4, 3, 7, 6, 1, 9, 0, 8};
//
//        Arrays.sort(ints);
//
//        System.out.println(Arrays.toString(ints));

        User[] users = {
                new User("john", "doe"),
                new User("max", "fifi"),
                new User("jane", "doe"),
                new User("alpha", "bravo"),
                new User("paul", "sam"),
        };

        System.out.println(Arrays.toString(users));

        Arrays.sort(users, new DescUserLoginComparator());

        System.out.println(Arrays.toString(users));

    }
}
