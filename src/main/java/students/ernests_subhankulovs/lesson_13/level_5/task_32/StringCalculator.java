package students.ernests_subhankulovs.lesson_13.level_5.task_32;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    int add(String numbers) {
        int sum = 0;
        String delimiter = "";
        Pattern pattern = Pattern.compile("\\[(.*?)\\]", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(numbers);
        while (matcher.find()) {
            for (int i = 0; i < matcher.groupCount(); i++) {
                delimiter += matcher.group(i);
            }
        }
        String[] numberList = numbers.split("[,\\n" + delimiter + "]");
        for (String number : numberList) {
            try {
                sum += Integer.parseInt(number);
            } catch (Exception e) {
                System.out.println("All values should be integer numbers divided by commas!");
            }
        }
        return sum;
    }
}
