package instructor.lesson_12.exceptions;

import java.util.ArrayList;
import java.util.List;

class ArrayBoundsExceptionDemo {

    public static void main(String[] args) {

        //String[] strings = new String[5];
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add("hello");
        }

        System.out.println(strings);
//        System.out.println(Arrays.toString(strings));

        for (int i = 0; i <= strings.size(); i++) {
            System.out.println(strings.get(i));
        }

    }
}
