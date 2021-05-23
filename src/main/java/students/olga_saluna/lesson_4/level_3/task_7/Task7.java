package students.olga_saluna.lesson_4.level_3.task_7;

class Task7 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Please enter X integer: ");

        int x = scanner.nextInt();

        System.out.println("Please enter Y integer: ");

        int y = scanner.nextInt();

        System.out.println("Please enter Z integer: ");

        int z = scanner.nextInt();

        if (x==y&&y==z) {System.out.println ("All numbers are equal");}
        if (x!=y&&y!=z) {System.out.println ("All numbers are different");}
        else {System.out.println ("Neither all are equal or different");}

    }
}
