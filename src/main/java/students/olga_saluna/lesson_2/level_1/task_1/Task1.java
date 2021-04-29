package students.olga_saluna.lesson_2.level_1.task_1;

class Task1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Please enter A integer: ");

        int a = scanner.nextInt();

        System.out.println("Please enter B integer: ");

        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("sum = " + sum);

        int sub = a - b;
        System.out.println("sub = " + sub);

        int mult = a * b;
        System.out.println("mult = " + mult);

        int div = a / b;
        System.out.println("div = " + div);




    }
}
