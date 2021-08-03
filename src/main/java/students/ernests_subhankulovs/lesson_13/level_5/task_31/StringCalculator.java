package students.ernests_subhankulovs.lesson_13.level_5.task_31;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    int add(String numbers) {
        int sum = 0;
        String delimiter = "";
        String testString = "//[;]\n";
        Pattern pattern = Pattern.compile("//\\[(.*?)\\]\\\n", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(testString);
        if (matcher.find()) {
            delimiter = matcher.group(1);
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
