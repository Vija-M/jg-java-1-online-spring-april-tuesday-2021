package students.olga_saluna.lesson_4.level_1.task_2;

class Task2 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Please enter any integer from 1 to 7: ");

        int x = scanner.nextInt();

        if (x == 1) {
            System.out.println("Monday");
        }
        if (x == 2) {
            System.out.println("Tuesday");
        }
        if (x == 3) {
            System.out.println("Wednesday");
        }
        if (x == 4) {
            System.out.println("Thursday");
        }
        if (x == 5) {
            System.out.println("Friday");
        }
        if (x == 6) {
            System.out.println("Saturday");
        }
        if (x == 7) {
            System.out.println("Sunday");
        }

    }
}
