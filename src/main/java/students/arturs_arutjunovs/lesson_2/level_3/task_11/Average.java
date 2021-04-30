package students.arturs_arutjunovs.lesson_2.level_3.task_11;

class Average {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Please enter three single numbers: ");
        int number_1 = scanner.nextInt();
        System.out.print("");
        int number_2 = scanner.nextInt();
        System.out.print("");
        int number_3 = scanner.nextInt();

        double average = (number_1 + number_2 + number_3) / 3.;

        System.out.println("The average number is: " + average);
    }
}
