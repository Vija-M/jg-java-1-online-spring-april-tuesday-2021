package students.olga_saluna.lesson_4.level_1.task_1;

class Task1 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Please enter any X integer: ");

        int x = scanner.nextInt();

        if (x > 0) {
            System.out.println("x > 0");
        }
        if (x < 0) {
            System.out.println("x < 0");
        }
        if (x == 0) {
            System.out.println("x = 0");
        }
    }

}
