package students.linda_junkina.lesson_13.level_5.task_26_27_28_29_30_31_32;


import java.util.stream.Stream;

class StringCalculator {

    int add(String input) {
        String delimiters = ",|\n";
        if(input.startsWith("//")){
            String[] integers = input.split("\n", 2);
            delimiters = integers[0].substring(2);
            input = integers[1];
        }
        String[] integers = input.split(delimiters);
        if (input.isBlank()) {
            return 0;
        } else {
            return calculateSum(integers);
        }
    }
    public int calculateSum(String[] integers) {
        int sum = 0;
        for (String integer : integers) {
            sum += Integer.parseInt(integer);
        }
        return sum;
    }
}
