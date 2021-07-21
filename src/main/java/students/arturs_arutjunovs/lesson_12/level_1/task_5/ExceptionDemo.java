package students.arturs_arutjunovs.lesson_12.level_1.task_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

class ExceptionDemo {
    public static void main(String[] args) throws IOException {

        int a = 10;
        System.out.println(a / 0);  //division by zero

        int[] b = new int[3];
        System.out.println(b[4]);  //out of bounds

        String user = null;
        System.out.println(user.toUpperCase());  //nullPointer exception

        List<Integer> ints = List.of(1, 2, 3);  //limitation to add elements
        ints.add(4);

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\manual.pdf"));
        String firstString = reader.readLine();
        System.out.println(firstString);        //FileNotFoundException

    }

}
