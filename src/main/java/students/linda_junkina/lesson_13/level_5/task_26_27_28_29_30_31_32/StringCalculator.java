package students.linda_junkina.lesson_13.level_5.task_26_27_28_29_30_31_32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StringCalculator {

    String delimiter = "[,|\n]";

    int add(String input) {
        String[] integers = input.split(delimiter);
        if (emptyString(input)) {
            return 0;
        }
        if (input.length() == 1) {
            return stringToInt(input);

        } else {
            return calculateSum(integers);
        }

    }

    public boolean emptyString(String numbers) {
        return numbers.isEmpty();
    }

    public int stringToInt(String numbers) {
        return Integer.parseInt(numbers);
    }

    public int calculateSum(String[] integers) {
        int sum = 0;
        for (String integer : integers) {
            sum += Integer.parseInt(integer);
        }
        return sum;
    }

}
