package students.olga_saluna.lesson_4.level_1_task_3;

class Task3 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Please enter any integer: ");

        int x = scanner.nextInt();
        int y = x%2;

        if (y==0) { System.out.println ("This is an even number.");}
        if (y!=0) { System.out.println ("This is not an even number.");}
    }
}
