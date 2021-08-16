package students.linda_junkina.lesson_13.level_5.task_26_27_28_29_30_31_32;

import java.util.Scanner;

class StringCalculator {

    int add(String numbers) {
        if (emptyString(numbers)){
            return 0;
        }else{
            return stringToInt(numbers);
        }
    }

    public boolean emptyString(String numbers) {
        return false;
    }

    public int stringToInt(String numbers) {
        return Integer.parseInt(numbers);
    }

}
