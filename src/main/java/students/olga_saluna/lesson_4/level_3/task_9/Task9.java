package students.olga_saluna.lesson_4.level_3.task_9;

class Task9 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Please enter X integer: ");

        int x = scanner.nextInt();

        System.out.println("Please enter Y integer: ");

        int y = scanner.nextInt();

        System.out.println("Please enter Z integer: ");

        int z = scanner.nextInt();

        if (x >= y&&x >= z) {System.out.println("Larger number is " + x); }
        else if (y >= x &&y >= z) {System.out.println("Larger number is " + y);}
        else {System.out.println("Larger number is " + z);}



    }
}
