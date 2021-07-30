package students.ernests_subhankulovs.lesson_13.level_5.task_26;

public class StringCalculator {

    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        System.out.println(calculator.add("1"));
    }

    int add(String numbers) {
        int sum = 0;
        String[] numberList = numbers.split(",");
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
