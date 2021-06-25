package students.dmitriy_shukailo.lesson_2.level_1.task_1;

class Calculator_Int {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("sum = " + a + " + " + b + " = " + sum);

        int sub = a - b;
        System.out.println("sub = " + a + " - " + b + " = " + sub);

        int div = a / b;
        System.out.println("sub = " + a + " / " + b + " = " + div);

        int mul = a * b;
        System.out.println("sub = " + a + " * " + b + " = " + mul);

    }

}
