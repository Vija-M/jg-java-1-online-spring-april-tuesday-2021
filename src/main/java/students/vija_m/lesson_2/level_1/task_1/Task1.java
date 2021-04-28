package students.vija_m.lesson_2.level_1.task_1;

class Task1 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Please, enter a number: ");
        int a = scanner.nextInt();

        System.out.print("Please, enter next number: ");
        int b = scanner.nextInt();

        System.out.println("a + b = " + (a + b) + ";");
        System.out.println("a - b = " + (a - b) + ";");
        System.out.println("a / b = " + (a / b) + ";");
        System.out.println("a * b = " + (a * b) + ";");
    }
}
