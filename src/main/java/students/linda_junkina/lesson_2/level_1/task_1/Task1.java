package students.linda_junkina.lesson_2.level_1.task_1;

class Task1 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int a = scanner.nextInt();
        System.out.print("Please, enter another number: ");
        int b = scanner.nextInt();

        int sumAddition = a + b;
        System.out.println(a + " + " + b + " = " + sumAddition);

        int sumSubtraction = a - b;
        System.out.println(a + " - " + b + " = " + sumSubtraction);

        int sumMultiplication = a * b;
        System.out.println(a + " * " + b + " = " + sumMultiplication);

        double sumDivision = (double) a / b;
        System.out.println(a + " / " + b + " = " + sumDivision);

    }
}
