package students.dmitrijs_matrenicevs.lesson_2.level_3.task_11;

class Task11 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("First: ");
        int a = scanner.nextInt();
        System.out.print("Second: ");
        int b = scanner.nextInt();
        System.out.print("Third: ");
        int c = scanner.nextInt();
        int sum = a + b + c;
        double result = sum / 3.0;

        System.out.println(/*"a + b + c = " + sum*/);
        System.out.println(/*sum + "/" + 3 +*/ "Result: = " + result);




    }
}
