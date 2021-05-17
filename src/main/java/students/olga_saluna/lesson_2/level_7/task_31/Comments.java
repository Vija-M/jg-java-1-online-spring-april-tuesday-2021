package students.olga_saluna.lesson_2.level_7.task_31;

class Comments {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Please, enter A integer: "); // Данная команда запрашивает у пользователя ввести целое число А
        int a = scanner.nextInt();

        System.out.print("Please, enter B integer: ");
        int b = scanner.nextInt();

        System.out.print("Please, enter C integer: ");
        int c = scanner.nextInt();

        double result = ((double) a + c + c)/3;
        System.out.print("Average = " + result);
        /*Данный блок выводит среднее
        арифметическое в
        десятичном формате*/

    }
}
