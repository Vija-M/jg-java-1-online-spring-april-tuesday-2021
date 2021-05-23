package students.olga_saluna.lesson_4.level_2.task_4;

class Task4 {
    public static void main(String[] args) {


    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("Please enter X integer: ");

    int x = scanner.nextInt();

    System.out.println("Please enter Y integer: ");

    int y = scanner.nextInt();

    if (x > y) {System.out.println ("Larger integer is " + x);}
    if (x < y) {System.out.println ("Larger integer is " + y);}

}
}