package students.ernests_subhankulovs.lesson_2.level_3.task_9;

class Task9 {
    public static void main(String[] args) {
        int result;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Input a number: ");
        int number = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.println(number + " X " + i + " = " + result);
        }
    }
}
