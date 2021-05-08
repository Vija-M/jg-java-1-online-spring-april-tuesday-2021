package students.antons_korenevskis.lesson_2.level_1.task_1;

class Task2 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введи число а");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Введи число b");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("a + b = " + String.format("%.2f", (firstDoubleNumber + secondDoubleNumber)));
        System.out.println("a - b = " + String.format("%.2f", (firstDoubleNumber - secondDoubleNumber)));
        System.out.println("a / b = " + String.format("%.2f", firstDoubleNumber / secondDoubleNumber));
        System.out.println("a * b = " + String.format("%.2f", firstDoubleNumber * secondDoubleNumber));

    }
}



