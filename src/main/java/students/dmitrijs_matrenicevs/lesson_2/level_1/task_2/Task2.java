package students.dmitrijs_matrenicevs.lesson_2.level_1.task_2;

class Task2 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter any 2 numbers: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = a + b;
        double d = a - b;
        double f = a * b;
        double g = a / b;

        System.out.println("Plus:" + /*"a + b"*/ " = " + c);
        System.out.println("Minus:" + /*"a - b"*/ " = " + d);
        System.out.println("Multiply:" + /*"a * b"*/ " = " + f);
        System.out.println("Share:" + /*"a / b"*/ " = " + g);

    }
}
