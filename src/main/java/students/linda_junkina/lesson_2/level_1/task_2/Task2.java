package students.linda_junkina.lesson_2.level_1.task_2;

class Task2 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Please, enter a fractional number: ");
        double a = scanner.nextDouble();
        System.out.print("Please, enter another fractional number: ");
        double b = scanner.nextDouble();

        double sumAddition = a + b;
        System.out.println(a + " + " + b + " = " + sumAddition);

        double sumSubtraction = a - b;
        System.out.println(a + " - " + b + " = " + sumSubtraction);

        double sumMultiplication = a * b;
        System.out.println(a + " * " + b + " = " + sumMultiplication);

        double sumDivision = a / b;
        System.out.println(a + " / " + b + " = " + sumDivision);

    }
}
