package students.ernests_subhankulovs.lesson_13.level_5.task_30;

public class StringCalculator {

    int add(String numbers) {
        int sum = 0;
        String[] numberList = numbers.split("[,\\n]");
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
